package org.apache.dubbo.showcase.boot.provider;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Provider {


    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }

}
