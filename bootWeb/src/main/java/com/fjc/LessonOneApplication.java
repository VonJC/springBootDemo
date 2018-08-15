package com.fjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:fjc
 * @Description:
 * @Date: 2018/7/11
 **/
@EnableEurekaServer
@SpringBootApplication
public class LessonOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(LessonOneApplication.class);
    }
}
