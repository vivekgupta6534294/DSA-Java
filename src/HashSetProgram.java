import java.util.*;
public class HashSetProgram {
    public static void main (String args[]){
        HashSet<Integer> myHashSet=new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(9);
        myHashSet.add(6);//Repeatation nor allowed
        System.out.println(myHashSet);

    }

    
}
