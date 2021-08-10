package com.fis.springlearn.EmployeeController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.EmployeeService.EmployeeService;

public class EmployeeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	private EmployeeService employeeService;
	
	public EmployeeController(){
		
			LOGGER.debug("Inside EmployeeController Constructor");
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
}
