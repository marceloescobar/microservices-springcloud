package com.mescobar.subject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class SubjectResource {

	
	private String message = "teste";
	
	@GetMapping(path="/subject")
	public String getSubject() {
		return message;
	}
	
}
