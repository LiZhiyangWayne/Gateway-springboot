package com.ylk.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

/**
 * @Author: Wayne
 * @Description: 主入口
 * @Create Date: 2018/4/4
 */

@ComponentScan(basePackages ="com.ylk.gateway")
@SpringBootApplication
@EnableCaching
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(Application.class, args);
    }

}