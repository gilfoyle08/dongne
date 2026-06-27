package com.example.dongne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DongneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongneApplication.class, args);
    }
}
