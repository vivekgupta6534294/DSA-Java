package CollectionFramework;

import java.util.*;
// import java.util.ArrayDeque;
public class ArrayDequeProgram {
    public static void main(String args[]){
       ArrayDeque<Integer> list1 =new ArrayDeque<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.addFirst(1);
        
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
    }

}
