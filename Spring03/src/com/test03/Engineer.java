package com.test03;

public class Engineer extends Emp {

	private String dept;

	public Engineer() {
	}

	public Engineer(String name, int salary) {

		super(name, salary);
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {

		return super.toString() + " \t부서:" + dept;

	}

}
