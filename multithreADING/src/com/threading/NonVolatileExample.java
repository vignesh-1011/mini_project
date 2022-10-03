package com.threading;

class SampleThread1 extends Thread
{
     volatile int count;
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
            Thread.sleep(i*100);
            ++this.count;
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    
    
    public int getCount()
    {
        return this.count;
    }
}



public class NonVolatileExample {

    public static void main(String[] args) throws InterruptedException {
        SampleThread1 t=new SampleThread1();
        
        Thread t1=new Thread(t,"t1");
        
        
        t1.start();
        t1.join();
        
        Thread t2=new Thread(t,"t2");
        
        t2.start();
        t2.join();
        
        System.out.println("count="+t.count);
        
    

    }

}
