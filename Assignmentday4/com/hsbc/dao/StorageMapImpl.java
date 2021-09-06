package com.hsbc.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.Employee;

public class StorageMapImpl implements Storage{
	private static int id=100;
	Map<Integer, Employee> empDb=new HashMap<>();
	
	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		int index = Employee.getEmpcount();
		if (index != 1) {
			Set<Integer> keys=empDb.keySet();
			
			for(Integer id:keys) {
				if(empDb.containsKey(id)) {
					throw new EmployeeAlreadyExistsException("Employee already exists");
				} else {
					empDb.put(id,e);
					id++;
					break;
				}
			}

		} else
			{empDb.put(id,e);
		id++;}

	}

	@Override
	public Employee getEmployee(int empno) throws EmployeeNotFoundException {
		Set<Integer> keys=empDb.keySet();
		
		for(Integer id:keys) {
			if(empDb.containsKey(empno)) {
				System.out.println("Employee Found !");
				return empDb.get(id);
				
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