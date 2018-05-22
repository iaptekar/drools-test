package com.myteam.test;

public class Greeter {

	private String greeting;
	private String name;

	public Greeter() {
	}

	public Greeter(String greeting, String name) {
		this.greeting = greeting;
		this.name = name;
	}

	public String greet() {
		return greeting + " " + name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Greeter [greeting=" + greeting + ", name=" + name + "]";
	}

}
