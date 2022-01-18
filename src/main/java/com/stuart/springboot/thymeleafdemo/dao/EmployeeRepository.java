package com.stuart.springboot.thymeleafdemo.dao;

import com.stuart.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Intentionally Empty

}
