package com.spring;

import com.spring.service.UserService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

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
Thread t = new Thread(new Runnable() {
	@SneakyThrows
	@Override
	public void run() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("id","10");
		map.put("name","Administrator");
		map.put("newName","admin");
		boolean flat = userService.updateByName(map);

	}
});

		Thread t1 = new Thread(new Runnable() {
			@SneakyThrows
			@Override
			public void run() {
				Map<String,String> map = new HashMap<String,String>();
				map.put("id","10");
				map.put("name","Administrator");
				map.put("newName","admin");
				boolean flat = userService.updateByName(map);

			}
		});


     t.start();
     t1.start();


		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//CircularDependencyA circA = context.getBean(CircularDependencyA.class);
		//  System.out.println(circA.getCircB().getMessage());
	}

}
