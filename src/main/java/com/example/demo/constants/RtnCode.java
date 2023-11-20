package com.example.demo.constants;

//列舉
public enum RtnCode {

	// 200 只 ok 的意思
	SUCCESSFUL(200, "successful"), //
	PARAM_ERROR(400, "Param error!!"),//
	ACCOUNT_EXISTED(400, "Account existed"),//
	ACCOUNT_NOT_FOUND(404,"account not found"),//
	INSUFFICIENT_BALANCE(400,"Insufficient blance")
	;

	private int code;

	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	// 只用 get 而已
	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
