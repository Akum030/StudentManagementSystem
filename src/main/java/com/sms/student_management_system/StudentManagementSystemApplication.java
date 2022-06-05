package com.sms.student_management_system;

import com.sms.student_management_system.entity.Student;
import com.sms.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner { //command line runner interface makes sure to run bean

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired                                //inject the object dependency implicitly
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
