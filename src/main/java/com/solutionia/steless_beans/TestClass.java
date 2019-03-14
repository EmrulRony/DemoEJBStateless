package com.solutionia.steless_beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.solutionia.model.StudentInfo;

@Singleton
@Startup
public class TestClass {
	@EJB
	StudentLocal student;

	@PostConstruct
	public void main() {
		String name = student.getName("Emrul");
		System.out.println(name);

		List<StudentInfo> studentList = student.getStudent();
		for (StudentInfo st : studentList) {
			System.out.println(st);

		}

	}
}
