package org.apache.dubbo.showcase.boot.consumer.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.showcase.boot.api.NameApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @DubboReference
    private NameApiService nameApiService;

    @GetMapping("/test")
    public String test(){
      return   nameApiService.queryName();
    }
}
