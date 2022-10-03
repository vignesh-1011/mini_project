package com.threading;


class DemoThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("Thread Name:"+currentThread().getName()+"\n"+"Priority:"+currentThread().getPriority());
    }
}

public class ThreadPriorityExample {

    public static void main(String[] args) {
        
        DemoThread t1=new DemoThread();
        DemoThread t2=new DemoThread();
        DemoThread t3=new DemoThread();
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        
        t2.start();
        t1.start();
        t3.start();
        
        
    }

}
