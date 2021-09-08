package com.hsbc.model;

import java.util.List;
import java.util.Scanner;

import com.hsbc.dao.PlayerTeam;
import com.hsbc.dao.PlayerTeamImpl;
import com.hsbc.exceptions.TeamNotFormedException;

public class TeamCreate {
	PlayerTeam player=new PlayerTeamImpl();
	Scanner sc=new Scanner(System.in);
	public void teamCreate(int n) {
		while(n!=0) {
			
			System.out.println("Enter rank");
			int rank=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter role");
			String role=sc.nextLine();
			
			player.addPlayer(new Player(name,role,rank));
			System.out.println("\nPlayer Added !\n");			
			n--;
		}
		
		
	
		
	}
	
	public void ShowPlayers() {
		try {
			List<Player> list=player.formTeam();
			int i=0;
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("Team formed with 11 players:");
			System.out.println("S No., Player Name, Category, Rank ");
		
			for (Player play : list) {
				System.out.println(i+","+play.getDetails());	
				i++;	
				}
			System.out.println("------------------------------------------------------------------------------");
		} catch (TeamNotFormedException e) {
		
		System.out.println(e.getMessage());
		}
		
	}
}
