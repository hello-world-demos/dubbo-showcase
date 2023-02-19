package org.apache.dubbo.showcase.consumer;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.showcase.api.service.ApiShowCaseService;

import java.util.concurrent.CountDownLatch;

public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Consumer");
        ReferenceConfig<ApiShowCaseService> reference = new ReferenceConfig<>();
        reference.setInterface(ApiShowCaseService.class);

        DubboBootstrap.getInstance()
                .application("api-dubbo-consumer")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .reference(reference);

        ApiShowCaseService service = reference.get();
        String message = service.name();
        System.out.println("Receive result ======> " + message);
        new CountDownLatch(1).await();
    }
}
