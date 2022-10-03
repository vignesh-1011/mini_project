package com.threading;
class Table
{
	void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 class m1 extends Thread
 {
	 Table t;
	 m1(Table t)
	 {
		 this.t=t;
	 }
	 public void run()
	 {
		 t.printTable(5);
	 }
 }
	 class m2 extends Thread
	 {
		 Table t;
		 m2(Table t)
		 {
			 this.t=t;
		 }
	 
	 public void run()
	 {
		 t.printTable(100);
	 }
	 }

public class Synchornized {
	public static void main(String args[])
	{
		Table ob=new Table();
		m1 t1=new m1(ob);
		m2 t2=new m2(ob);
		t1.start();
		t2.start();
		
	}

}
