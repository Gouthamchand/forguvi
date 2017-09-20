package guvi;

import java.io.Reader;
import java.util.Scanner;
import javax.print.DocFlavor;

public class pro1 {

    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=in.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
            System.out.println("The number is negative");
        else
            System.out.println("the number is zero");
    }
    
}
