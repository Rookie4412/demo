package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Menu 對應資料庫的內容,例如name & price


//資料庫託管 Entity
@Entity
@Table(name = "menu")
public class Menu {

	// 看哪個資料表哪個有勾選PK 就要加 (Id)
	@Id
	@Column(name = "name")
	public String name;

	@Column(name = "price")
	public int price;

	public Menu() {
		super();
	}

	public Menu(String name, int price) {
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

}
