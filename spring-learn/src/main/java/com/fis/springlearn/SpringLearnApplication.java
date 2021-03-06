package com.fis.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.EmployeeController.EmployeeController;
import com.fis.springlearn.bean.Employee;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
//		SpringApplication.run(SpringLearnApplication.class, args);

		// displayDate();
		// displayCountry();
		//displayCountries();
		//displayEmployee();
		getEmployeeController();
	}
	static void getEmployeeController() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeController employeeController = context.getBean("controller", EmployeeController.class);
		LOGGER.debug("EmployeeController : {}", employeeController);
		LOGGER.info("END");
	}
	static void displayEmployee(){
		LOGGER.info("Start");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = context.getBean("employee", Employee.class);
		
		LOGGER.debug("employee : {}", employee);
		context.close();
		LOGGER.info("End");
	}
	static void displayCountries() {
		LOGGER.info("Start");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> country = context.getBean("countryList", ArrayList.class);
		
		LOGGER.debug("Countries : {}", country);
		context.close();
		LOGGER.info("End");
	}

	static void displayCountry() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country);
		LOGGER.debug("Country : {}", anotherCountry);
		context.close();
	}

	static void displayDate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		// Date parseDate;
		try {
			Date parseDate = format.parse("31/12/2018");
			System.out.println(parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		context.close();
	}

}
