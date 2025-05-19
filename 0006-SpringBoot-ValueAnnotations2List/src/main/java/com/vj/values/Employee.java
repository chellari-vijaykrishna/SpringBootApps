package com.vj.values;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {
	private String name;
	private Integer no;
}
