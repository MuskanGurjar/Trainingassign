package com.hsbc.ui;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;
import com.hsbc.dao.Storage;
import com.hsbc.exceptions.EmployeeAlreadyExistsException;
import com.hsbc.exceptions.EmployeeNotFoundException;
import com.hsbc.exceptions.InvalidStorageTypeException;
import com.hsbc.factory.StorageFactory;
import com.hsbc.model.Employee;

public class UserUI {

	Scanner scan = new Scanner(System.in);
	
	StorageFactory sc = new StorageFactory();
	Storage storage = StorageFactory.getStorage(1);
	
	
	
	public void CheckEqual(Employee e1,Employee e2) {
		System.out.println(""+storage.CheckEquals(e1, e2));
	}
	public void ShowHashcode() {
		storage.ShowHashCode();
	}
	public void acceptEmpDetailsAndStore(int count) {
		while(count!=0) {
		System.out.println("Enter details");
		System.out.println("Enter empno");
		int empno = scan.nextInt();
		
		System.out.println("Enter salary");
		float salary = scan.nextFloat();
		System.out.println("Enter first name");
		String firstname = scan.nextLine();
		System.out.println("Enter last name");
		String lastname = scan.nextLine();
		System.out.println("Enter city");
		String city = scan.nextLine();
		System.out.println("Enter date in dd-mm-yyyy format");
		String date=scan.nextLine();
		
		
		SimpleDateFormat ft = new SimpleDateFormat ("dd-mm-yyyy"); 
	      String input = date.length() == 0 ? "11-11-1818" : date; 

	      
	      Date t = null;
	      try {
	         t = ft.parse(input); 
	         
	      } catch (Exception e) { 
	         System.out.println("Unparseable date "); 
	      }
		
		
		try {
			storage.addEmployee(new Employee(empno, firstname, lastname, city, salary,t));
			System.out.println("Employee added !");
		} catch (EmployeeAlreadyExistsException e) {
			
			System.out.println(e.getMessage());
			break;
		}
		
		count--;
		}
	}

	public void DisplayEmpByEmpno() {
		System.out.println("Enter empno to display details ");
		int empno = scan.nextInt();
		
		try {
			Employee emp = storage.getEmployee(empno);
			
			System.out.println("Details : "+emp.showDetails());
		} catch (EmployeeNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
}
