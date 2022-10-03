package com.threading;

public class InterruptThread extends Thread {

    public void run()
    {
        try 
        {
            Thread.sleep(200);
        } 
        catch (InterruptedException e) 
        {
            throw new RuntimeException("Interrupted");
            
        }
    }
    
    
    public static void main(String[] args) {
        
        InterruptThread t1=new InterruptThread();
        t1.start();
        try
        {
        t1.interrupt();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled!!");
        }
    }

}
