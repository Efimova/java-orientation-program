package com.epam.efimova.basic;

public class Boo {
	public Boo(String s) {
		// TODO Auto-generated constructor stub
	}
	public static final int i =1;

	static {
		System.out.println("Boo static initialising block...");
	}

	{
		System.out.println("Boo initialising block...");
	}
}
