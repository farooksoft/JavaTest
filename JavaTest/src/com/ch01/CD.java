package com.ch01;

import java.util.Date;

public class CD {

	int id;
	String title;
	String artist;
	Date purchaseDate;
	double cost;
	
	public CD() {
	}
	
	public CD(String title, String artist,Date purchaseDate, double cost){
		this.title = title;
		this.artist = artist;
		this.purchaseDate = purchaseDate;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
