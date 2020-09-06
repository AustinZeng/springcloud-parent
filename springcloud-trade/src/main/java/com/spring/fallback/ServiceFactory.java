package com.spring.fallback;

import com.spring.client.ServerClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-05 14:00
 */
@Component
public class ServiceFactory implements FallbackFactory<ServerClient> {


    @Override
    public ServerClient create(Throwable arg0) {
        return new ServerClient(){
            @Override
            public String query(String text) {
                arg0.printStackTrace();
                return "服务调用失败，参数："+text+",错误描述："+arg0.getMessage();
            }
        };
    }
}
