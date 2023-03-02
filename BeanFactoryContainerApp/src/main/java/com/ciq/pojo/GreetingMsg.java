package com.ciq.pojo;

/**
 * @author burrasrikanth
 *
 */
public class GreetingMsg {

	private int id;
	private String name;
	
	public GreetingMsg() {
		// TODO Auto-generated constructor stub
	}

	public GreetingMsg(int id, String name) {
		this.id = id;
		this.name = name;
	}





	public void setId(int id) {
		this.id = id;
	}

 

	public void setName(String name) {
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "GreetingMsg [id=" + id + ", name=" + name + "]";
	}



 
}
