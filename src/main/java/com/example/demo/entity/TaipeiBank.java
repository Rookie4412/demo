package com.example.demo.entity;

public class TaipeiBank {
	private String branch;

	private String user;

	private int balance = 1000;

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// ¦s¿ú
	public int saving(int amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}

	// ´£´Ú
	public int withdraw(int amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
		}
		return balance;
	}
	//2023 11 06
	public String saving(Dog dog , int... inte) {
		return "";
	}
	// inte [0]:
	public String saving1(Dog dog , int ...inte) {
		return "";
	}

}
