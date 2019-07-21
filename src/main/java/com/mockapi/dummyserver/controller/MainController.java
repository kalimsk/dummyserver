package com.mockapi.dummyserver.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mockapi.dummyserver.service.MainService;

@RestController
public class MainController {

	@Autowired
	MainService mainService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("**")
	public String handleRequest(){
		return mainService.getContent(request.getRequestURI());
	}
}
