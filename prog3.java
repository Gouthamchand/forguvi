package guvi;

import java.util.Scanner;


public class prog3 {
    public static void main(String[] args) {
     
    char ch;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the character:");
    ch=in.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A'  && ch<='Z'))
    {
    
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("The character is vowel.");
    else
            System.out.println("The character is consonant.");
    }
    else
            System.out.println("Enter valid character.");
    
    
   }
}