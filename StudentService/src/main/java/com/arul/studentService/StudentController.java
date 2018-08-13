package com.arul.studentService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/studentService/message/{message}")
	public Map<String, String> message(@PathVariable(name="message") String message)
	{
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Student Service");
		map.put("message", message);
		return map;
	}
}
