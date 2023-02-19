package org.apache.dubbo.showcase.provider;

import org.apache.dubbo.showcase.api.service.ApiShowCaseService;

public class ApiShowCaseServiceImpl implements ApiShowCaseService {
    @Override
    public String name() {
        return "dubbo api provider >" + this.getClass().getPackage().getName();
    }
}
