//Reversing the String using Recursion
package Array;
import java.util.Scanner;
public class StringReverse3 {
    public static String reverse_string(String rev){
        if(rev.isEmpty()){
            return rev;
        }
        // rev.substring(1);
        return reverse_string(rev.substring(1))+ rev.charAt(0);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String to reverse using Recursion");
        String str=sc.nextLine();
        sc.close();
        System.out.println(reverse_string(str));

    }
   
    
}
