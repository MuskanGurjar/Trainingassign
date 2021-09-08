package com.hsbc.model;

public class Player  implements Comparable< Player > {
private String name;
private String category;
private Integer rank;
public Player(String name, String role, int rank) {
	super();
	this.name = name;
	this.category = role;
	this.rank = rank;
}
public String getName() {
	return name;
}
public String getCategory() {
	return category;
}
public Integer getRank() {
	return rank;
}
@Override
public int compareTo(Player o) {
	// TODO Auto-generated method stub
	return this.getRank().compareTo(o.getRank());
}
public String getDetails() {
	// TODO Auto-generated method stub
	return name+","+category+","+rank;
}

}
