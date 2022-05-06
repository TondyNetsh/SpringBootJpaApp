package com.springapp.SpringBootJpaApp.repository;

import com.springapp.SpringBootJpaApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
