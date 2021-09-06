
package com.hsbc.ui;

import com.hsbc.exceptions.WrongInputException;
import com.hsbc.model.LearningModule;
import java.util.Scanner;
public class Mainques5 {

	public static void main(String[] args) {
		LearningModule learningmodule=new LearningModule();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		try{
		
			System.out.println(""+learningmodule.getLearningCode(name, age));
		}catch(WrongInputException e) {
			System.out.println(e.getMessage());
		}
	}

}
