package com.threading;

class ExampleThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try 
            {
                sleep(3000);
            } 
            catch (InterruptedException e) 
            {
                
                System.out.println("Exception handled!!");
            }
            
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}




public class ResumeSuspendExample {

    public static void main(String[] args) {
        //t1.supend()  - t1.resume()
        
        ExampleThread t1=new ExampleThread();
        ExampleThread t2=new ExampleThread();
        t1.start();
        t2.start();
        
        t1.suspend();
        
        t1.resume();
        
        

    }
}

