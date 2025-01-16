package com.rabbitMQ.producer.service.impl;

import com.rabbitMQ.producer.model.Employee;
import com.rabbitMQ.producer.repository.EmployeeRepository;
import com.rabbitMQ.producer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }
}
