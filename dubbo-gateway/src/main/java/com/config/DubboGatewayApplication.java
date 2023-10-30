package com.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDubbo
public class DubboGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboGatewayApplication.class, args);
        System.out.println("网关启动成功");
    }

}
