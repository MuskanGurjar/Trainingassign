package com.hsbc.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.exceptions.TeamNotFormedException;
import com.hsbc.model.Employee;
import com.hsbc.model.Player;

public class PlayerTeamImpl implements PlayerTeam{
	List<Player> players = new ArrayList<Player>();
	@Override
	public void addPlayer(Player p) {
		players.add(p);
		
	}
	public void Show() {
		 Collections.sort(players);
			
		for (Player play : players) {
		System.out.println(play.getCategory()+play.getName()+play.getRank());	
		}
		
	}
	@Override
	public List<Player> formTeam() throws TeamNotFormedException {
	int batsman=0,bowler=0,wicketkeeper=0;
		if(players.size()<11) {System.out.println("Players insufficient");}
		else {
			Collections.sort(players);
		}
	  
	
	return players;
	
		
	}
//for (Employee emp : empList) {
}
