package com.zx.edas.common;

import com.zx.edas.common.dao.CMDeviceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DeviceUtils {
    /**
     * 1 2500km;2 630km;3 78km;4 30km
     * 5 2.4km; 6 610m; 7 76m; 8 19m
     */
    private static int hashLength = 8; //经纬度转化为geohash长度
    private static int latLength = 20; //纬度转化为二进制长度
    private static int lngLength = 20; //经度转化为二进制长度

    public static final double MINLAT = -90;
    public static final double MAXLAT = 90;
    public static final double MINLNG = -180;
    public static final double MAXLNG = 180;

    private double minLat;//每格纬度的单位大小
    private double minLng;//每个经度的倒下
    private static final char[] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    @Autowired
    CMDeviceDao cmDviceDao;

    public List<Object> getNearObjectByLocation(double lat, double lng) {

        List<Object> res = new ArrayList<Object>();

        return res;
    }

    @Bean
    public void test() {

//        Random random = new Random();
//        for (int i = 0; i < 2000; i++) {
//            CMDevice cd = new CMDevice();
//            cd.setDt("1");
//            cd.setId(String.valueOf(i));
//            cd.setNm("device_" + String.valueOf(i));
//            cd.setDes("");
//            cd.setLat(31 + random.nextDouble());
//            cd.setLng(121 + random.nextDouble());
//            cd.setGbId("1");
//
//            cd.setGeoHash(this.getGeoHashBase32(cd.getLat(),cd.getLng()));
//
//            cmDviceDao.save(cd);
//        }
    }


    /**
     * @param lat
     * @param lng
     * @return
     * @Author:lulei
     * @Description: 获取经纬度的base32字符串
     */
    public static String getGeoHashBase32(double lat, double lng) {
        boolean[] bools = getGeoBinary(lat, lng);
        if (bools == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bools.length; i = i + 5) {
            boolean[] base32 = new boolean[5];
            for (int j = 0; j < 5; j++) {
                base32[j] = bools[i + j];
            }
            char cha = getBase32Char(base32);
            if (' ' == cha) {
                return null;
            }
            sb.append(cha);
        }
        return sb.toString();
    }

    /**
     * @param lat
     * @param lng
     * @return
     * @Author:lulei
     * @Description: 获取坐标的geo二进制字符串
     */
    public static boolean[] getGeoBinary(double lat, double lng) {
        boolean[] latArray = getHashArray(lat, MINLAT, MAXLAT, latLength);
        boolean[] lngArray = getHashArray(lng, MINLNG, MAXLNG, lngLength);
        return merge(latArray, lngArray);
    }


    public static boolean[] merge(boolean[] latArray, boolean[] lngArray) {
        if (latArray == null || lngArray == null) {
            return null;
        }
        boolean[] result = new boolean[lngArray.length + latArray.length];
        Arrays.fill(result, false);
        for (int i = 0; i < lngArray.length; i++) {
            result[2 * i] = lngArray[i];
        }
        for (int i = 0; i < latArray.length; i++) {
            result[2 * i + 1] = latArray[i];
        }
        return result;
    }

    /**
     * @param value
     * @param min
     * @param max
     * @return
     * @Author:lulei
     * @Description: 将数字转化为geohash二进制字符串
     */
    public static boolean[] getHashArray(double value, double min, double max, int length) {
        if (value < min || value > max) {
            return null;
        }
        if (length < 1) {
            return null;
        }
        boolean[] result = new boolean[length];
        for (int i = 0; i < length; i++) {
            double mid = (min + max) / 2.0;
            if (value > mid) {
                result[i] = true;
                min = mid;
            } else {
                result[i] = false;
                max = mid;
            }
        }
        return result;
    }

    /**
     * @param base32
     * @return
     * @Author:lulei
     * @Description: 将五位二进制转化为base32
     */
    public static char getBase32Char(boolean[] base32) {
        if (base32 == null || base32.length != 5) {
            return ' ';
        }
        int num = 0;
        for (boolean bool : base32) {
            num <<= 1;
            if (bool) {
                num += 1;
            }
        }
        return CHARS[num % CHARS.length];
    }
}
