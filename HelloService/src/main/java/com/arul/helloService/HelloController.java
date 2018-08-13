package com.arul.helloService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	@GetMapping("/helloService/name/{name}")
	public String hello(@PathVariable(name="name") String name)
	{
		return "Hello " + name.toUpperCase();
	}
}
