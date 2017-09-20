
package guvi;

import java.util.Scanner;


public class proj4 {
    public static void main(String[] args) {
     
    char ch;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the character:");
    ch=in.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A'  && ch<='Z'))
            System.out.println("The given character is Alphabet.");
     else
     System.out.println("The character is not alphabet");
    
    }   
    
   
}
