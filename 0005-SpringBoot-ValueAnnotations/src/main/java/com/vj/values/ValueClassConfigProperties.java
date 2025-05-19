package com.vj.values;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("valueClassProperties")
@PropertySource("classpath:com/vj/props/file.properties")
@ConfigurationProperties(prefix = "man.person")
@Data// getter and setter are mandatory
public class ValueClassConfigProperties {

	private String name;

	private Integer no;
	
	private String addrs;

	private Integer age;

	private String hobbies;

}
