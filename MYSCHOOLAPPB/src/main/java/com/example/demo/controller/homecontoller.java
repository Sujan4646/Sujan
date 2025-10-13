package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class homecontoller {
	@Get@Mapping("/home")
public String home()
{
	return "hello welcome";
}
}
