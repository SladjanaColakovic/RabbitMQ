package com.rabbitMQ.producer.controller;

import com.rabbitMQ.producer.dto.EmployeeDto;
import com.rabbitMQ.producer.dto.NewEmployeeDto;
import com.rabbitMQ.producer.model.Employee;
import com.rabbitMQ.producer.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @Autowired
    private ModelMapper mapper;

    @PostMapping
    public ResponseEntity<?> create(NewEmployeeDto newEmployee){
        Employee employee = service.create(mapper.map(newEmployee, Employee.class));
        return new ResponseEntity<>(mapper.map(employee, EmployeeDto.class), HttpStatus.CREATED);
    }
}
