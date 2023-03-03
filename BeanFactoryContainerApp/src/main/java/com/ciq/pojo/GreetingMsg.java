package com.ciq.pojo;

/**
 * @author burrasrikanth
 *
 */
public class GreetingMsg {

	private int id;
	private String name;

	public GreetingMsg() {
		System.out.println("Creation of the object");

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

	public void hi() {
		System.out.println("o	When a bean is instantiated, it may be required to perform some "
				+ "initialization to get it into a usable state");
	}

	public void bye() {
		System.out.println(
				"When the bean is no longer from the required and is removed container, some cleanup may be required. If any destruction methods are configured");
	}

}
