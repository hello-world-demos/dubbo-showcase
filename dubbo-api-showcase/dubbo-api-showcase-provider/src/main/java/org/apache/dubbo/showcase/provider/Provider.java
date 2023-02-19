package org.apache.dubbo.showcase.provider;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.showcase.api.service.ApiShowCaseService;

public class Provider {


    public static void main(String[] args) {
        System.out.println("provider");
        // 定义具体的服务
        ServiceConfig<ApiShowCaseService> service = new ServiceConfig<>();
        service.setInterface(ApiShowCaseService.class);
        service.setRef(new ApiShowCaseServiceImpl());

        // 启动 Dubbo
        DubboBootstrap.getInstance()
                .application("api-dubbo-provider")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(service)
                .start()
                .await();

    }
}
