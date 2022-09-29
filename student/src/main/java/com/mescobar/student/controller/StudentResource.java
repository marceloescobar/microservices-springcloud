package com.mescobar.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mescobar.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentResource {

	@Autowired
	StudentService studentService;
	
	@GetMapping(path ="/student/info")
	public String getStudentInfo() {
		return studentService.getStudentInfo();
	}
}
