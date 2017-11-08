package com.example.Studbackend;

import java.util.List;

public interface StudentService {

	public Student save(Student stud);

	public List<Student> getAll();

	public Student find(Integer rollno);

	public void delete(Integer rollno);

	// public Student updateDetails(Number rollno, Student bean);

	

}