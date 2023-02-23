package org.apache.dubbo.showcase.spring.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class Consumer {


    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Consumer.class, args);
        new CountDownLatch(1).await();
    }
}
