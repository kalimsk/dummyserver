package com.mockapi.dummyserver.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.mockapi.dummyserver.service.MainService;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	Environment env;
	
	@Value("${data.path}/")
	String dataFilePath;
	
	@Override
	public String getContent(String url) {
		
		String content = "";
		String fileName = env.getProperty(url);
		try {
			content = new String(Files.readAllBytes(Paths.get(dataFilePath+fileName)));
		} catch (IOException e) {
			
		}
		return content;
	}

}
