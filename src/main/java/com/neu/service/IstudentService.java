package com.neu.service;

import java.util.List;

import bean.Student;

public interface IstudentService {
	public List<Student> getStudents();
	public Student getStudentById(int id);
	public int add(Student student);
	public int update(Student student);
	public int del(int id);
}
