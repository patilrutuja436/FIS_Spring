package com.fis.employe;
import java.util.stream.Stream;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeInitilizer implements CommandLineRunner {

    private final EmpRepository empRepository;

    EmployeeInitilizer(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Sham", "Siddhie", "Poonam", "Ram", "Aniket", "Om", "Raju")
                .forEach(emp -> empRepository.save(new Employee(emp)));

        empRepository.findAll().forEach(System.out::println);
    }
}
