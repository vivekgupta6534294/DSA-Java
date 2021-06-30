package CollectionFramework;

import java.util.*;
public class LinkedListProgram {
    public static void main (String args[]){
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(16);
        l1.add(7);
        l1.add(0,15);
        l1.addAll(0,l2);
        l1.addLast(4);//Not present in linked list
        l1.addFirst(788); 
        l1.pop();
        l1.push(99);
        l1.pollLast();
        l1.addLast(88);
        // l1.clear();
        System.out.println(l1.contains(15));//Will return true false 
        // System.out.println(l1.lastIndexOf(7));
        System.out.println(l1.indexOf(7));
        l1.set(1,566);//will make the 2nd number as 566
         for(int i=0;i<l1.size();i++){
             System.out.print(l1.get(i)+" ");

        } 
        // below part wil reverse the linked list 
        Iterator x=l1.descendingIterator();
        while(x.hasNext()){
            System.out.println("Value is : "+x.next());

        }
    }
    
}
