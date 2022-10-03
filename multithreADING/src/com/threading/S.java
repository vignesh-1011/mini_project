package com.threading;

class Ba extends Thread
{
    public void run()
    {
    for(int i=1;i<=10;i++)
    {
        System.out.println(currentThread().getName()+":"+i);
        
    }


}
}


public class S {

    public static void main(String[] args) {
        Ba t1=new Ba();
        t1.setName("A");
        Ba t2=new Ba();
        t2.setName("B");
        Ba t3=new Ba();
        t3.setName("C");
        
        t1.start();
         t1.yield();
        t2.start();
          t2.yield();
        t3.start();

    }

}
