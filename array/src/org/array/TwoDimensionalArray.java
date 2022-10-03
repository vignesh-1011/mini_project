package org.array;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        
        int rows,cols;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        rows=scan.nextInt();
        System.out.println("Enter the number of columns:");
        cols=scan.nextInt();
        
        int ar[][]=new int[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter the elements for "+"["+i+"]"+"["+j+"]"+"location:");
                ar[i][j]=scan.nextInt();
                
            }
            
            
        }
        
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            
            System.out.println();
        }

    }

}


