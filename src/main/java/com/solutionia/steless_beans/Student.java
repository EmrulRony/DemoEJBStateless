package com.solutionia.steless_beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.solutionia.model.StudentInfo;

/**
 * Session Bean implementation class Student
 */
@Stateless
@LocalBean
public class Student implements StudentLocal {
	@PersistenceContext
	EntityManager em;

    /**
     * Default constructor. 
     */
    public Student() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getName(String name) {
		return name;
	}
	
	public List<StudentInfo> getStudent(){
		TypedQuery<StudentInfo> query=em.createNamedQuery("StudentInfo.findAll", StudentInfo.class);
		return query.getResultList();
		
	}
	@PostConstruct
	public void startUp() {
		System.out.println("I am starting up...");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("I am cleaning up...");
	}

}
