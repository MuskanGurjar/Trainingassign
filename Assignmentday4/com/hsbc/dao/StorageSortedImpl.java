package com.hsbc.dao;

import java.util.TreeSet;

import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.Employee;

public class StorageSortedImpl implements Storage{
	TreeSet<Employee> empList=new TreeSet<Employee>();

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		int index = Employee.getEmpcount();
		if (index != 1) {
			for (Employee emp : empList) {
				if (emp.getEmpno() == e.getEmpno()) {
					throw new EmployeeAlreadyExistsException("Employee already exists");
				} else {
					empList.add(e);
					break;
				}
			}

		} else
			empList.add(e);

	}

	@Override
	public Employee getEmployee(int empno) throws EmployeeNotFoundException {
		
		
		for (Employee emp : empList) {
			if (emp.getEmpno() == empno) {
				System.out.println("Employee Found !");
				return emp;
				
			}
			
		}
		throw new EmployeeNotFoundException("Employee Not Found!");
	}

	@Override
	public void ShowHashCode() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean CheckEquals(Employee g1, Employee g2) {
		// TODO Auto-generated method stub
		return false;
	}

}
