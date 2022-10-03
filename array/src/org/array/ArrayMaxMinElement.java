package org.array;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMaxMinElement {

    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        
        System.out.println("Enter the size of the array:");
        int size=Integer.parseInt(br.readLine());
        
        int ar[]= new int[size];
        for(int i=0;i<ar.length;i++)
        {
            System.out.print("Enter element at "+i+" location:");
            ar[i]=Integer.parseInt(br.readLine());
        }
        
        int max,min;
        max=min=ar[0]; 
        
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
                
            }
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        
        
        System.out.println("Largest element:"+max);
        System.out.println("Smallest element:"+min);

    }

}
