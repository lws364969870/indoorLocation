package com.code.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestController {
	// 这里使用@RequestMapping注解表示该方法对应的二级上下文路径
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String getUserByGet(@RequestParam(value = "userName") String userName) {
		return "Hello " + userName;
	}
}
