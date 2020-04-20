package com.logan.yinkai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.logan.yinkai.mapper")
public class YinkaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YinkaiApplication.class, args);
    }

}
