import java.util.Scanner;

import com.hsbc.model.TeamCreate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TeamCreate team=new TeamCreate();
		System.out.println("Welcome! Please select the action you want to perform\r\n"
				+ " 1. Add Players to repository\r\n"
				+ " 2. Form team ");
		while(true) {
			
			System.out.print("Enter your choice : ");
		int choice=sc.nextInt();
		if(choice==1) {System.out.println("Enter the number of players that you would like to add");
						int n=sc.nextInt();
						
						team.teamCreate(n);}
						
		else if(choice ==2) {team.ShowPlayers();}
		else System.out.println("Wrong choice !");
		}
	}

}
 