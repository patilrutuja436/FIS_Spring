package com.fis.springlearn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skill {
	private static final Logger LOGGER = LoggerFactory.getLogger(Employee.class);
	
	int id;
	String name;
	public Skill() {
		LOGGER.info("Inside Skill Package");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	

}
