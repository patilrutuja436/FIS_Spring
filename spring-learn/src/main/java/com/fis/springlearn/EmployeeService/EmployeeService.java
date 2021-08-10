package com.fis.springlearn.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.EmployeeDao.EmployeeDao;



public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	private EmployeeDao employeeDao;
	public EmployeeService(){
		LOGGER.debug("Inside EmployeeService Constructor");
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
