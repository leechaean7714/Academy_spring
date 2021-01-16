package com.test02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	
	 @Autowired //autowired="default"     bytype->byName//바로 아래 private Student student에 적용
	 @Qualifier("hong")
	 
	
	@Resource(name="hong")                //byName->byType
	private Student student;
	
	private int grade;
	
	public School() {}

	public School(Student student, int grade) {
		super();
		this.student = student;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "student=" + student + "\t grade:" + grade;
	}
	
	

}
