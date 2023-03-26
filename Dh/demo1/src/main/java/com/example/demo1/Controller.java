package com.example.demo1;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.models.Input;


@RestController
public class Controller {
	
	private static List<Input> data = new LinkedList<Input>();

	
	@GetMapping("/showEmpDetails")
	public List<Input> showData() {
		return data;
	}
	
	@PostMapping("/saveEmpData")
	public String saveEmpData(@RequestBody Input input) {
		System.out.println(input);
		data.add(input);
		return input.getFirstName()+input.getSecondName();
		

	}	
}

