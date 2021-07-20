//Reversing the String using Inbuilt Function
package Array;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        StringBuilder temp = new StringBuilder();
        temp.append(str);
        temp = temp.reverse();
        System.out.println(temp);
        sc.close();
    }
}