package com.oms.entity;

import jakarta.validation.constraints.NotNull;

public class Order {
	@NotNull
	private String item;
	private float price;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}

}
