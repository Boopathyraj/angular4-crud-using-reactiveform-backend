package com.example.Studbackend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repo;
	@Override
	public Student save(Student stud) {
        
		return this.repo.saveAndFlush(stud);
	}
	@Override
	public List<Student> getAll() {
		return this.repo.findAll();
	}
	@Override
	public Student find(Integer rollno) {
		
		// System.out.println("impl");
		// Student a= this.repo.findOne(rollno);
		// for(int i=0;i<=5;i++)
		// {
		// 	System.out.println(a.getname()+ ""+a.getaddress());
		// }
		return this.repo.findOne(rollno);
	}
	@Override
	public void delete(Integer rollno) {
		this.repo.delete(rollno);
	}
	// @Override
	// public Student updateDetails(Number rollno, Student bean) {
		
	// 	return null;
	// }
	

}