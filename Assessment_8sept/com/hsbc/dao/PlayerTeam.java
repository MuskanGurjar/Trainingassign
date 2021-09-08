package com.hsbc.dao;

import java.util.List;

import com.hsbc.exceptions.TeamNotFormedException;
import com.hsbc.model.Player;

public interface PlayerTeam {
void addPlayer(Player p);
List<Player> formTeam() throws 	TeamNotFormedException;

}
