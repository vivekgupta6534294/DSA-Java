import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

//Given a string print all possible palindromic partition 
public class AllpossiblePalindromeString {
    public static void main(String[] args) {
        String input="nitin";
        //also geeks as input for example 2
        System.out.println("All possible palindrome partitions  for "+input + "are :");
        allPalPartitions(input); 
    }
    private static void allPalPartitions(String input){
        int n=input.length();
        ArrayList<ArrayList<String>> allPart =new ArrayList<>();
        Deque<String> currPart=new LinkedList<String>();
        allPalPartitionUtil(allPart,currPart,0,n,input);
        for(int i=0;i<allPart.size();i++){
            for(int j=0;j<allPart.get(i).size();j++){
                System.out.print(allPart.get(i).get(j) + " ");
            }
            System.out.println();
        }       

    }
    private static void allPalPartitionUtil(ArrayList<ArrayList<String>> allPart,
    Deque<String> currPart,int start, int n,String input)
    {
        if(start>=n){
            allPart.add(new ArrayList<>(currPart));
            return;
        }
        for(int i=start;i<n;i++){
            if(isPalindrome(input,start,i)){
                currPart.addLast(input.substring(start,i+1));
                allPalPartitionUtil(allPart,currPart,i+1,n,input);
                currPart.removeLast();
            }
        }
    }
    private static boolean isPalindrome(String input,int start,int i){
        while(start<i){
            if(input.charAt(start++)!=input.charAt(i--))
            return false;
        }
        return true;
    }
}
