//Reversing the String using iterative approach
package Array;
import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the String ");
      String str=sc.nextLine();
       int i;
       String temp="";
       for(i=str.length()-1;i>=0;i--){
           char ch=str.charAt(i);
           temp=temp+ch;
       }
      System.out.println(temp);
      
   }
}
