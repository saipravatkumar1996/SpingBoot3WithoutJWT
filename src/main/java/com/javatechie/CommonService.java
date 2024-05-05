package com.javatechie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javatechie.entity.UserInfo;
import com.javatechie.service.ProductService;

@Component
public class CommonService implements CommandLineRunner {

	 @Autowired
	    private ProductService service;
	 
	@Override
	public void run(String... args) throws Exception {
		UserInfo userInfo=new UserInfo();
		userInfo.setEmail("pravat.behera@csm.tech");
		userInfo.setName("pravat");
		userInfo.setPassword("pwd1");
		userInfo.setRoles("ADMIN");
		service.addUser(userInfo);
		userInfo.setName("pravat1");
		userInfo.setRoles("USER");
		service.addUser(userInfo);
	}

}
