package com.example.demo.service.ifs;

import com.example.demo.vo.AtmResponse;

public interface AtmService {

	public AtmResponse addInfo(String account, String pwd);

	public AtmResponse getBalanceAccount(String account, String pwd);

	public AtmResponse updataPwd(String account, String oldPwd, String newPwd);
	
	public AtmResponse deposit(String account, String Pwd, int amount) ;

	public AtmResponse withdraw(String account, String Pwd, int amount) ;

}
