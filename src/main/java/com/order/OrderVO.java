package com.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class OrderVO {

	@javax.persistence.Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Integer Id;
	
	@NotBlank(message = "Item cannot be blank")
	String item;
	
	@Min(value = 1, message = "Price cannot be lest than 1")
	float price;
	int quantity;
	
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
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
