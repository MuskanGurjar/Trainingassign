package com.hsbc.model;

import java.util.Date;

public class Employee  implements Comparable<Employee> {
	private static int empcount = 0;
	private Date date;
	private int empno;
	private String firstname, lastname, city;
	private float salary;

	public Employee(int empno, String firstname, String lastname, String city, float salary,Date date) {
		empcount++;
		this.empno = empno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.salary = salary;
		this.date=date;
	}

	public Employee(int empno, String firstname, String lastname, String city, float salary) {
		this.empno = empno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.salary = salary;
	}

	public String showDetails() {
		return empno + " " + firstname + " " + lastname + " " + city + " " + salary+" "+date;
	}

	public static int getEmpcount() {
		return empcount;
	}

	public int getEmpno() {
		return empno;
	}

	

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if(e1.getEmpno()==this.getEmpno())
			return 1;
			else 
				return 0;
	}
	@Override
	public int hashCode() {
		// System.out.println("hashCode called..");
		// final int prime = 31;
		// int result = 1;
		// result = prime * result + empId;
		return empno;
	}

	@Override
	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Employee other = (Employee) obj;
		if (this.empno != other.empno)
			return false;
		return true;
	}

	public String empname() {
		// TODO Auto-generated method stub
		return firstname;
	}
}
