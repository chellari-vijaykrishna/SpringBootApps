package com.vj.values;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("valueClass")
@ConfigurationProperties(prefix = "man.person")
@Data
public class ValueClass {
	
	
	private String name;
	
	private Integer no;
	
	private String addrs;

	@Value("#{ ${person.amount1} + ${person.amount2} }")
	private Integer amount;
	
	private Integer age;
	
	private List<String> hobbies;
	
	private Set<Long> phoneNumbers;
	
	private Map<Object,Object> documents;
	
	private Employee emp;
	
}
