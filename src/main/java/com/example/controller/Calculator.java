package com.example.controller;

public class Calculator {

	private int duration;
	private String categoryId;
	
	public Calculator(int duration, String categoryId) {
		super();
		this.duration = duration;
		this.categoryId = categoryId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
