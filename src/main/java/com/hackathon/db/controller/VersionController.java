package com.hackathon.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VersionController {

	@GetMapping("/version")
	public String getMethodName() {
		return new String("0.0.1-SNAPSHOT");
	}
	

}
