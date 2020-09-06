package com.spring;

import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("com.spring.mapper")
@SpringBootTest
public class SpringOrderApplicationTests {


	//@Autowired
	//ApplicationContext context;

	@Autowired
	UserService userService;


	@Test
	public void contextLoads() {


       /*User user = userService.query(10);
        System.out.println(user.getAccount());*/



		//CircularDependencyA circA = context.getBean(CircularDependencyA.class);
		//  System.out.println(circA.getCircB().getMessage());
	}

}
