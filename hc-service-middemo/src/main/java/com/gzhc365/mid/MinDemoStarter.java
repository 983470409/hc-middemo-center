package com.gzhc365.mid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 17:24
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MinDemoStarter {

    public static void main(String[] args) {
        SpringApplication.run(MinDemoStarter.class, args);
    }
}
