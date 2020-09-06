package com.spring.client;

import com.spring.fallback.ServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(value ="inventory",/*fallbackFactory = ServiceFactory.class*/fallback= ServiceFallback.class)
public interface ServerClient {

    @RequestMapping(value = "/inventory/query")
    public String query(@RequestParam("goods_id") String goodsId);


}
