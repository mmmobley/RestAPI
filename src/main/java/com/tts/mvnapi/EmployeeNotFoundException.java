package com.tts.mvnapi;

class EmployeeNotFoundException extends RuntimeException {
	
	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
