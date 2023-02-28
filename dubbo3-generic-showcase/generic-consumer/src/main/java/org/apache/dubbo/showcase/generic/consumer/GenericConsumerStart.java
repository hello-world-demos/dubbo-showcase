package org.apache.dubbo.showcase.generic.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class GenericConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(GenericConsumerStart.class, args);
    }
}
