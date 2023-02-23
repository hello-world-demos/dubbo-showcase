package org.apache.dubbo.showcase.spring.provider.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class Provider {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Provider.class, args);
        new CountDownLatch(1).await();
    }
}
