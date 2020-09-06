package com.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: zengcong
 * @create: 2020-06-04 16:01
 */

@RestController
@RequestMapping(value = "inventory")
public class InventoryController {

    @RequestMapping(value = "query")
    public String query(@RequestParam("goods_id") String goodsId){

        return "服务Inventory打印："+goodsId;

    }


    @RequestMapping(value = "notify")
    public String notify(HttpServletRequest request) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        String reqBody = sb.toString();
        System.out.println("接受到回调数据:"+reqBody);

       return "SUCCESS";

    }

}
