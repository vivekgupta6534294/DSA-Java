public class CheckPalindrome {
    public static void main(String[] args) {
        int n =45554;//Assume this is the input by the user
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int number ){
        int temp=reverseNumber(number,0);
        if(number==temp){
            return true;
        }
        else{
            return false;
        }
    }
    static int reverseNumber(int n,int temp){
        if(n==0){
            return temp;
        }
        temp=(temp*10)+(n%10);
        return reverseNumber(n/10,temp);
    }
    
}
