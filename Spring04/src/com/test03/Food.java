package com.test03;

public class Food {
	
	private String name;
	private int price;
	
	public Food() {}

	public Food(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름:" + name + "\t 가격:" + price;
	}
	
	

}
