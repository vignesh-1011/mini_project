package com.threading;
class Table1
{
    synchronized void printTable(int n)//shared resource
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i*n);
            
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}



class P extends Thread
{
    Table1 t;
    P(Table1 t)
    {
        this.t=t;
    }
    
    
    public void run()
    {
        t.printTable(5);
    }
}

class Q extends Thread
{
    Table1 t;
    Q(Table1 t)
    {
        this.t=t;
    }
    
    
    public void run()
    {
        t.printTable(10);
    }
}

public class ProblemWithoutSynchronization {

    public static void main(String[] args) {
        
        Table1 t=new Table1();
        P t1=new P(t);
        
        Q t2=new Q(t);
        
        t1.start();
        t2.start();
        
        

    }

}