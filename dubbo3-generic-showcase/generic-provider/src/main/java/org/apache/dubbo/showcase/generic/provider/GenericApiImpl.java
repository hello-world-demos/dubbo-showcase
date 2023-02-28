package org.apache.dubbo.showcase.generic.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.showcase.generic.api.GenericApi;
import org.springframework.stereotype.Service;

@DubboService
public class GenericApiImpl implements GenericApi {

    public String name(){
        return "GenericApi  `~";
    }
}
