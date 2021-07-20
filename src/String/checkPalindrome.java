//Program to check whether the given String is Palindrome or not 
package String;

public class checkPalindrome {
    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(0)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        String str="Vivek";
        if(isPalindrome(str)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
}
