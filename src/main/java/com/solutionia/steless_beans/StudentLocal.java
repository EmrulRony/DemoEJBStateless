package com.solutionia.steless_beans;

import java.util.List;

import javax.ejb.Local;

import com.solutionia.model.StudentInfo;

@Local
public interface StudentLocal {
String getName(String name);
List<StudentInfo> getStudent();
}

