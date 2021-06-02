import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram {
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);// This method is used to append a specific element to the end of a list.
        l1.add(1, 2); // This method is used to insert a specific element at a specific position index
                      // in a list.
        l2.add(5);
        l1.addAll(l2);//This method is used to append all the elements from a specific collection to the end of the mentioned list, in such an order that the values are returned by the specified collection’s iterator.
        l1.addAll(0,l2);//Used to insert all of the elements starting at the specified position from a specific collection into the mentioned list.
        // l1.clear();
        l1.ensureCapacity(5000);//Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.

        l1.forEach((n)-> System.out.println(n));
        int first=l1.indexOf(5);//as the name says it find the index of element 5 
        int last=l1.lastIndexOf(5);
        System.out.println("The first index of 5 is "+ first+"and the last index of 5 is "+ last);
        boolean check=l1.isEmpty();//Checks whether the list is empty or not 
        System.out.println(check);
        // for (int i = 0; i < l1.size(); i++) {
        //     System.out.print(l1.get(i));
        //     System.out.print(", ");
        // }
        ListIterator<Integer> abc=l1.listIterator();//This method returns a list iterator over the elements in this list (in proper sequence)
        while(abc.hasNext()){
            System.out.println("Value of the list is " + abc.next());
        }
        //Below i am creating the Array list to Normal Array
        //First Option 
        Object[] object=l1.toArray();
        for(Object n: object){
            System.out.print(n);
        }
        //Second option using Integer 
        Integer[] arr=new Integer[l1.size()];
        arr=l1.toArray(arr);
        /*or we could write loop starting from 0 to size and than put arr of i = l1.get(i) */
        for(Integer n:arr){
            System.out.print(n);
        }

    }

}
