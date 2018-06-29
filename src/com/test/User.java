package com.test;

public class User {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}

	public User() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		Manager u = new Manager();
	}
}

class Manager extends User {

	static {
		System.out.println("4");
	}
	{
		System.out.println("5");
	}

	public Manager() {
		System.out.println("7");
	}

}