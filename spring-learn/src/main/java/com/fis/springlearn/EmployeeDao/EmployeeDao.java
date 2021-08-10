package com.fis.springlearn.EmployeeDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	 
	
	public EmployeeDao(){
		LOGGER.debug("Inside EmployeeDao Constructor");
	}
}
