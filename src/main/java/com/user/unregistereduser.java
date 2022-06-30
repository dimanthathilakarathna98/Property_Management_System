package com.user;

public class unregistereduser extends user {

	private String unregisteredid;
	
	public unregistereduser(String unregisteredid,int id, String firstname, String lastname, String birthday, String email, String phone,
			String password) {
		super(id, firstname, lastname, birthday, email, phone, password);
		// TODO Auto-generated constructor stub
		
		this.unregisteredid=unregisteredid;
	}
	

}
