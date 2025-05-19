package com.vj.runner;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vj.model.EmployeeDetails;
import com.vj.model.PersonInfo;
import com.vj.service.IEmployeeService;
import com.vj.service.IPersonService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private IPersonService service;
	
	@Autowired
	private IEmployeeService empService;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		PersonInfo personInfo = new PersonInfo();
		System.out.println("Enter Person Name..");
		String personName = sc.nextLine();
		
		System.out.println("Enter Person Age..");
		Integer personAge = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter Person Date Of Birth..");
		String dateString  = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate personDateOfBirth = LocalDate.parse(dateString, dateFormatter);
        
        System.out.println("Enter Person Time Of Birth..");
		String timeString   = sc.nextLine();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime personTimeOfBirth = LocalTime.parse(timeString, timeFormatter);
        
		System.out.println("Enter Person Date and Time of the Marriage..");
		String personDateTimeOfMarriageString = sc.nextLine();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime personDateTimeOfMarriage = LocalDateTime.parse(personDateTimeOfMarriageString,dateTimeFormatter);
		
		
		personInfo.setPName(personName);
		personInfo.setPAge(personAge);
		personInfo.setPDob(personDateOfBirth);
		personInfo.setPBot(personTimeOfBirth);
		personInfo.setPDTom(personDateTimeOfMarriage);
		
		System.out.println(service.registerPersonDetails(personInfo));
		
		System.out.println("Save the Date for Marriage....!");
		
		System.out.println("Can I Retrive Person Data if Ok Enter Yes or No");
		String option = sc.nextLine();
		if(option.equalsIgnoreCase("Yes"))
			service.fetchPersonInfo().forEach(System.out::println);
		else
			System.out.println("Thank you .....!");
		sc.close();
		
		
		

		System.out.println("Runner Started....!!!");	
		System.out.println("Enter Photo Path ::");
		//C:\Users\Ch Vijay Krishna\Desktop\Example\photo.jpg
		Scanner scc = new Scanner(System.in);
		String photoPath = scc.nextLine();
		System.out.println("Enter Resume ::");
		//C:\Users\Ch Vijay Krishna\Desktop\Example\Resume.txt
		String resumePath = scc.nextLine();
			
		//Convert into BLOB  byte[]
		byte[] photoContent = null;
		try (InputStream is = new FileInputStream(photoPath)) {
		    photoContent = is.readAllBytes();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Convert into CLOB char[]
	    
	    char[] resumeContent = null;
	    try (FileReader reader = new FileReader(resumePath)) {
	        File file = new File(resumePath);
	        resumeContent = new char[(int) file.length()];
	        reader.read(resumeContent);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    scc.close();

		EmployeeDetails employeeDetails = new EmployeeDetails(photoContent, resumeContent);
		System.out.println(empService.registerEmployeeDetails(employeeDetails));
		
		
		EmployeeDetails empPhoto = empService.fetchEmployeePhoto(102);	
		byte b[] = empPhoto.getEmpPhoto();
		OutputStream stream = new FileOutputStream("output.jpg");
		stream.write(b);
		stream.flush();
		stream.close();
		
		
		EmployeeDetails empResume = empService.fetchEmployeeResume(102);	
		char c[] = empResume.getEmpResume();
		Writer wri = new FileWriter("output_resume.txt");
		wri.write(c);
		wri.flush();
		wri.close();
		
	}
		
}
