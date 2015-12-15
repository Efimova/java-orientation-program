package com.epam.efimova.basic;

//try-catch-finally
public class Foo extends Boo {

    private String str = "some string";

	static {
		System.out.println("static initialising block #1");
	}

	static {
		System.out.println("static initialising block #2");
	}

	public Foo() {
		super("str1");
		System.out.println("Foo without parameters");
	}
	{
		System.out.println("initialising block #1");

	}

	public Foo(String s) {
		super(s);
		System.out.println("Foo with String parameter");
	}

	


	{
		System.out.println("initialising block #2");
	}

	// Constructor call must be the first statement in a constructor
	public Foo(Integer i) throws Exception {

		this("s");

		try {
			System.out.println("Executing try block...");
			throw new Exception("try exception method");
		} catch (Exception e) {
			System.out.println("Executing catch block...");
			throw new Exception("catch exception method");
		} finally {
			System.out.println("Executing finally block...");
			return;
		}

	}

	public static void main(String[] args) {
		System.out.println(Boo.i);
	}

}
