package org.example;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Master
 */
@SpringBootApplication
@MapperScan(basePackages = "org.example.dao")
public class LoginServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoginServiceApplication.class,args);
    }
}
