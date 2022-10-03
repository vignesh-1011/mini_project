package org.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductService {

    public static void main(String[] args) throws NumberFormatException, IOException, ProductIdNotFoundException  {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter product id:");
        int productId=Integer.parseInt(br.readLine());
        
        
         if(productId==1)
         {
             System.out.println("Demo Product 1");
             System.out.println("price:"+2000);
         }
         else if(productId==2)
         {
             System.out.println("Demo Product 2");
             System.out.println("price:"+3000); 
         }
         else if(productId==3)
         {
             System.out.println("Demo Product 3");
             System.out.println("price:"+4000); 
         }
         else
         {
             ProductIdNotFoundException ob=new ProductIdNotFoundException("Invalid product Id!!");
             throw ob;
         }
 
    }

}
