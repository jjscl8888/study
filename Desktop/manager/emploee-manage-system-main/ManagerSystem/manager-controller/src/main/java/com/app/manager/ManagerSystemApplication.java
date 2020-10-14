package com.app.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.app.manager")
public class ManagerSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerSystemApplication.class, args);
    }
}
