package com.example.Studbackend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud")
public class Student {

    @Column
    private String name;
    @Id
    @Column
    private int rollno;
    @Column
    private String department;
    @Column
    private String address;

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public Number getrollno(){
        return rollno;
    }

    public void setrollno(int rollno)
    {
        this.rollno=rollno;
    }

    public String getdepartment(){
        return department;
    }

    public void setdepartment(String department){
        this.department=department;
    }
    public String getaddress(){
        return address;
    }

    public void setaddress(String address){
        this.address=address;
    }
    
}