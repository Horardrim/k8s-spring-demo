package com.horardrim.cm.spring.demo.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {
    @GetMapping("hello")
	public String hello(){
        logger.info("handle hello in hello;");
		return "Hello World!";
	}

	@GetMapping("/")
	public String index() {
		logger.info("handle / in index");
		return "Greetings k8s";
	}
}
