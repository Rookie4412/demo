package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Menu ������Ʈw�����e,�Ҧpname & price


//��Ʈw�U�� Entity
@Entity
@Table(name = "menu")
public class Menu {

	// �ݭ��Ӹ�ƪ���Ӧ��Ŀ�PK �N�n�[ (Id)
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
