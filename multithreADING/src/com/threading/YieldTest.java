package com.threading;

class B extends Thread
{
    public void run()
    {
    for(int i=1;i<=10;i++)
    {
        System.out.println(currentThread().getName()+":"+i);
        
    }


}
}


public class YieldTest {

    public static void main(String[] args) {
        B t1=new B();
        t1.setName("A");
        B t2=new B();
        t2.setName("B");
        B t3=new B();
        t3.setName("C");
        
        t1.start();
         t1.yield();
        t2.start();
          t2.yield();
        t3.start();

    }

}
