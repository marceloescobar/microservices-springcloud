package com.mescobar.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mescobar.student.remote.SubjectService;

@Service
public class StudentService {

	@Autowired
	private SubjectService subjectService;
	
	//@CircuitBreaker(name = "breaker", fallbackMethod = "getStudentInfoFallback")
	public String getStudentInfo() {
		return subjectService.getSubject();
	}
}
