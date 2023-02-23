package org.apache.dubbo.showcase.spring.provider.impl;

import org.springframework.stereotype.Service;

@Service
public class SpringApiService implements org.apache.dubbo.showcase.spring.api.SpringApiService {
    @Override
    public String api() {
        return "api";
    }
}
