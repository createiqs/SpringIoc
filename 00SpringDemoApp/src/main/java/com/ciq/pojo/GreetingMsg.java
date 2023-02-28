package com.ciq.pojo;

public class GreetingMsg {

	private int id;
	private String name;
	
	

//	public GreetingMsg(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}





	public void setId(int id) {
		this.id = id;
	}





 




	public void setName(String name) {
		this.name = name;
	}





	public void msg() {
		System.out.println(id + " " + name + " welcome to spring framework!!!");
	}

}
