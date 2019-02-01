package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Msg;


@RestController
public class LoginController {
	//TODO 抽取到properties文件中
	static String[] defaultUser = {"admini","test"};
	/**
	 * 登录功能
	 * @return
	 */
    @GetMapping("/login")
    private Msg Login(@RequestParam String account,@RequestParam String password){
    	List<String> defaultUserList = Arrays.asList(defaultUser);
    	//测试时使用,如果登录账号是配置的账号,直接通过,否则不允许登录,以后改成从数据库查;
    	if (defaultUserList.contains(account)) {
			return  Msg.success();
		} 
		return Msg.fail();
    }



}
