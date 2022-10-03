package com.threading;
class mt extends Thread
{
	public void run()
	{
	System.out.println("thread insert");
	}
}

public class CreateMT {
	public static void main (String[] args)
	{
		mt t=new mt();
		t.start();
		
	}

}
