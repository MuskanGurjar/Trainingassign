package com.hsbc.dao;

import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.Employee;

public interface Storage {
void addEmployee(Employee e) throws EmployeeAlreadyExistsException;

Employee getEmployee(int empno)throws EmployeeNotFoundException;
void ShowHashCode();

boolean CheckEquals(Employee g1, Employee g2);
}
