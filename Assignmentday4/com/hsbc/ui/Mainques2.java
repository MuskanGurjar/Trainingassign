package com.hsbc.ui;

import com.hsbc.model.Employee;

public class Mainques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserUI user=new UserUI();
		user.acceptEmpDetailsAndStore(1);
		user.DisplayEmpByEmpno();
		user.ShowHashcode();
		user.CheckEqual(new Employee(101,"muskan","gurjar","delhi",234),new Employee(102,"jatin","gurjar","jaipur",123));
		user.CheckEqual(new Employee(101,"muskan","gurjar","delhi",234),new Employee(101,"muskan","gurjar","delhi",234));
	}

}
