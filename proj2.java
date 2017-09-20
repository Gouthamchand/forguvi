package guvi;

import java.util.Scanner;

public class proj2 {
   public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=in.nextInt();
        
       if(num==0)
           System.out.println("the numbe is zero");
            
       else if(num%2==0)
        {
            System.out.println("The number is even.");
        }
        else if(num%2==1)
            System.out.println("The number is odd");
        else 
            System.out.println("enter valid number");
    }
   }  

  

