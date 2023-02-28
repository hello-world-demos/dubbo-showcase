package org.apache.dubbo.showcase.generic.consumer;

import org.apache.dubbo.config.spring.ReferenceBean;
import org.apache.dubbo.config.spring.reference.ReferenceBeanBuilder;
import org.apache.dubbo.rpc.service.GenericService;
import org.apache.dubbo.showcase.generic.api.GenericApi;
import org.apache.dubbo.showcase.generic.api.MyApi;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DubboConfig {


    @Bean
    public ReferenceBean<MyApi> myApi(){
        return new ReferenceBeanBuilder()
                .setInterface(MyApi.class).build();
    }

    /**
     * 泛型明确指定
     * @return
     */
    @Bean
    public ReferenceBean<GenericApi> helloApi(){
        return new ReferenceBeanBuilder()
//                .setInterface("org.apache.dubbo.showcase.generic.provider.GenericApi")
                .setInterface(GenericApi.class)
                .build();
    }


}
