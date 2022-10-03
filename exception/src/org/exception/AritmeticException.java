package org.exception;

public class AritmeticException {

	public static void main(String[] args) {
		int a=10,b=0,c;
		try
		{
		c=a/b;
		System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
		System.out.println("  infinity");
				

	}

}
