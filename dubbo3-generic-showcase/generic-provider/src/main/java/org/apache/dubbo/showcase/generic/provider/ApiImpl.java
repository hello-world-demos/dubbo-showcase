package org.apache.dubbo.showcase.generic.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.showcase.generic.api.MyApi;
import org.springframework.stereotype.Service;

@DubboService
public class ApiImpl implements MyApi {
    @Override
    public String hello() {
        return "myapi";
    }
}
