package com.threading;
class ItMT implements Runnable
{
	 public void run()
	{
		System.out.println("this type also thread insert");
	}
	
}

public class InterfaceMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable T =new ItMT();
		Thread t1=new Thread(T);
		t1.start();
		

	}

}
