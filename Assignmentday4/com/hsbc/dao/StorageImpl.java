package com.hsbc.dao;

import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.model.Employee;

public class StorageImpl implements Storage {
	Employee[] Emplist = new Employee[20];

	@Override
	public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
		
		int index = Employee.getEmpcount();
		if(index!=1) {
	
		for(int i=0;i<index;i++) {
			
			if(Emplist[i].getEmpno()==e.getEmpno()) {
				throw new EmployeeAlreadyExistsException("Employee already exists");
			
			
			}
			else {
				Emplist[index-1] = e;
				break;
			}
		}
		}
		else
			Emplist[index-1] = e;
		
	}

	@Override
	public Employee getEmployee(int empno)throws EmployeeNotFoundException {
		int index = Employee.getEmpcount();
	
		for (int i = 0; i < index; i++) {
			if (Emplist[i].getEmpno() == empno) {
				System.out.println("Employee Found !");
				return Emplist[i];
				
			}
			
		}
		throw new EmployeeNotFoundException("Employee Not Found!");
		
	}


	public void ShowHashCode() {
		
		int index = Employee.getEmpcount();
		
		for (int i = 0; i < index; i++) 
			System.out.println( "hashcode :"+Emplist[i].hashCode());
		
	}

	
	public boolean CheckEquals(Employee g1,Employee g2) {
		
		if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                return true;
            else
                return false;
      
        }
        else
       return false;
    } 
	}

