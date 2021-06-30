package CollectionFramework;
import java.util.Comparator;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueProg {
   public static void main(String[] args) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       pq.offer(12);
       pq.offer(15);
       pq.offer(85);
       pq.offer(16);
       pq.offer(178);
       System.out.println(pq);
       pq.poll();
       System.out.println(pq);
       System.out.println(pq.peek());

   } 
}
