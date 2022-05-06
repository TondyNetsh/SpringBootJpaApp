package com.springapp.SpringBootJpaApp.service.impl;

import com.springapp.SpringBootJpaApp.model.Employee;
import com.springapp.SpringBootJpaApp.repository.EmployeeRepository;
import com.springapp.SpringBootJpaApp.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }
}
