package org.example;


import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Master
 *
 * 微服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EuroKaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EuroKaApplication.class,args);
    }
}
