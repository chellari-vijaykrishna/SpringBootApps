package com.vj.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//@Component("valueClass")
@PropertySource("src/main/java/com/vj/props/file.properties")
public class ValueClass {
	
	@Value("${person.name:#{null}}")
	private String name;
	@Value("${person.no:#{null}}")
	private Integer no;
	@Value("${person.addrs:#{null}}")
	private String addrs;

	@Value("#{ ${person.amount1} + ${person.amount2} }")
	private Integer amount;
	
	public String getValues() {
		return name+" :: "+" :: "+no+" :: "+addrs+" "+amount;
	}
	
	@Value("${person.age:#{null}}")
	private Integer age;
	
	@Value("${person.hobbies:#{null}}")
	private String hobbies;
	
	public String getValuesforInput() {
		return age+" :: "+" :: "+hobbies;
	}
	
	
	@Value("${Path}")
	private String path;
	
	@Value("${os.name}")
	private String osName;
	
	public String getValuesforSystemProps() {
		return osName+" :: "+" :: "+path;
	}
	
	
	
}
