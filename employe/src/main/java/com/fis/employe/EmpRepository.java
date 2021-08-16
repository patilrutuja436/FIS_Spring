package com.fis.employe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository  extends JpaRepository<Employee, Long> 
{

}
