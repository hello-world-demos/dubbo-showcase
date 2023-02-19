package org.apache.dubbo.showcase.boot.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.showcase.boot.api.NameApiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubbo
@SpringBootApplication
public class Consumer {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Consumer.class, args);
        NameApiService bean = run.getBean(NameApiService.class);
        System.out.println(bean);
    }

}
