import java.util.Set;
import java.util.*;
public class wordbreak {
    private static Set<String> dictionary=new HashSet<>();
    public static void main(String args[]){
        String temp_dictionary[]={"mobile","samsung","sam","sung","man","mango","icecream","and","go","i","like","ice","cream"};
        //add all the value of tempdictionary into the dictionary 
        for(String temp: temp_dictionary){
            dictionary.add(temp);
        }
        System.out.println(wordBreak("ilikesamsung"));
        System.out.println(wordBreak("iiiiiiii"));
        System.out.println(wordBreak(""));
        System.out.println(wordBreak("ilikelikeimangoiii"));
        System.out.println(wordBreak("samsungandmango"));
        System.out.println(wordBreak("samsungandmangok"));
    }
    public static boolean wordBreak(String word){
        int size=word.length();
        //base case
        if(size==0) return true;
        // checking all the words
        for(int i=0;i<=size;i++){
            // dividing into two parts the first will contain in dictionary and rest string wil be passed
            if(dictionary.contains(word.substring(0,i)) && wordBreak(word.substring(i,size)))
            return true;
        }
        return false;

    }  
}
