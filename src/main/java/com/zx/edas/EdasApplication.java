package com.zx.edas;

import com.zx.edas.common.DeviceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EdasApplication {

    @Autowired
    DeviceUtils deviceUtils;

    public static void main(String[] args) {
        SpringApplication.run(EdasApplication.class, args);

    }
}
