package org.apache.dubbo.showcase.boot.provider.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.showcase.boot.api.NameApiService;
import org.springframework.stereotype.Service;

@Slf4j
@DubboService
public class NameServiceImpl implements NameApiService {
    @Override
    public String queryName() {

        return "this is provider support by dubbo";
    }

    @Override
    public Boolean registerName(String name) {
        log.info("receive param name:{}", name);
        return true;
    }
}
