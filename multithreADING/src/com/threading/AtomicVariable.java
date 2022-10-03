package com.threading;

import java.util.concurrent.atomic.AtomicInteger;

class SampleThread2 extends Thread
{
    private AtomicInteger count=new AtomicInteger();
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
            Thread.sleep(i*100);
            count.incrementAndGet();
            
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    
    
    public int getCount()
    {
        return count.get();
    }
}



public class AtomicVariable {

    public static void main(String[] args) throws InterruptedException {
        SampleThread2 t=new SampleThread2();
        
        Thread t1=new Thread(t,"t1");
        
        
        t1.start();
        t1.join();
        
        Thread t2=new Thread(t,"t2");
        
        t2.start();
        t2.join();
        
        System.out.println("count="+t.getCount());
        
    

    }

}
