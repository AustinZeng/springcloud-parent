package com.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@MapperScan("com.spring.mapper")
@EnableEurekaClient
@EnableFeignClients
public class SpringTradeApplication {

	public static void main(String[] args) {

			SpringApplication.run(SpringTradeApplication.class, args);

	}

}
