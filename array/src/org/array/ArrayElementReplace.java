package org.array;


import java.util.Scanner;

public class ArrayElementReplace {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        
        int arr[]= {11,22,33,44,55,66,77,88,99,111,11};
        
        System.out.println("Enter the index:");
        int index=scan.nextInt();
        
        System.out.println("Enter the element:");
        int element=scan.nextInt();
        
        
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        
        
        for(int i=0;i<arr.length;i++)
        {
            if(index==i)
            {
                arr[i]=element;
                
            }
        }
        
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }

}
