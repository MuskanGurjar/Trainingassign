package com.hsbc.web.entity;

public class BookDeatils {
private String title,author;
private double price;
private int id;
public BookDeatils() {}
public BookDeatils(String title, String author, double price, int id) {
	
	this.title = title;
	this.author = author;
	this.price = price;
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getAuthor() {
	return author;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setSalary(double price) {
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
