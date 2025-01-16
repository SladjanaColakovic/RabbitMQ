package com.rabbitMQ.producer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NewEmployeeDto {
    private String name;
    private String surname;
    private String position;
}
