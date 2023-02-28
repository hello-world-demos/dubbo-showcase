package org.apache.dubbo.showcase.generic.consumer;

import org.apache.dubbo.showcase.generic.api.GenericApi;
import org.apache.dubbo.showcase.generic.api.MyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppliRun implements ApplicationRunner {

    @Autowired
    private MyApi myApi;
    @Autowired
    private GenericApi genericApi;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(myApi.hello());
        System.out.println(genericApi.name());
    }
}
