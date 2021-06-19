import java.util.*;
import java.io.*;
public class PartitionInKsubset {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(new ArrayList<>());
        }
        solution(1,n,k,0,ans);//1 is the initial no of element 
        //n=no of element k=no of set 0= setsofar ans= arraylist of arraylist
    }
    
}
