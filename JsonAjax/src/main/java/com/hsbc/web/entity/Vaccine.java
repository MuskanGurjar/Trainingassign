package com.hsbc.web.entity;

public class Vaccine {
	private String name,seconddose;
	private String[] side_effects;
	private String[] precautions;
public Vaccine() {}

public Vaccine(String name, String seconddose, String[] side_effects, String[] precautions) {

	this.name = name;
	this.seconddose = seconddose;
	this.side_effects = side_effects;
	this.precautions = precautions;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSeconddose() {
	return seconddose;
}
public void setSeconddose(String seconddose) {
	this.seconddose = seconddose;
}
public String[] getSide_effects() {
	return side_effects;
}
public void setSide_effects(String[] side_effects) {
	this.side_effects = side_effects;
}
public String[] getPrecautions() {
	return precautions;
}
public void setPrecautions(String[] precautions) {
	this.precautions = precautions;
}}
