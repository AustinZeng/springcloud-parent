package com.spring.fallback;

import com.spring.client.ServerClient;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-05 11:51
 */
@Component
public class ServiceFallback implements ServerClient {

    @Override
    public String query(String goodsId) {

        return "库存查询服务调用失败,商品ID为："+goodsId;
    }
}
