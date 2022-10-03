package com.threading;
class Daemon extends Thread
{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("it is daemon thread");
	}
	else
	{
		System.out.println("other thread");
	}
}
}
public class Daemonthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daemon t1=new Daemon();
		Daemon t2=new Daemon();
		Daemon t3=new Daemon();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
