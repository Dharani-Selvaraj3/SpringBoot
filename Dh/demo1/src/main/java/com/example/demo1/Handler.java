package com.example.demo1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Handler{
	
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public String result(@RequestBody String name)
	{
		return name;
	}
}