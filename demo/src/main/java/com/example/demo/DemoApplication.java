package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ok")
	public String ok()
	{
		return "OK!";
	}

	@PostMapping("/post")
	public ResponseEntity<Model> post(@RequestBody Model model)
	{
		model.Content = model.Content + " created on " + model.DateTime;
		return ResponseEntity.ok(model);
	}
}
