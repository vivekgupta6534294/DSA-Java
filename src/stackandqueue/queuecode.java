// Implementing queue 
package stackandqueue;
public class queuecode {
    private int [] arr;//Array to Store Queue element 
    private int front;//Front points to the front element in the queue 
    private int rear;///rear points to the last element in the queue
    private int capacity;//maximum capacity of the queue
    private int count;// current size of the queue
     queuecode(int size){
         arr=new int[size];
         capacity=size;
         front =0;
         rear=-1;
         count =0;
     }
     // Dequeue is used to pop the element in the queue
     public void dequeue(){
         if (isEmpty()){
             System.out.println("Underflow \n Program Terminated" );
             System.exit(1);
         }
         System.out.println("Removing " + arr[front]);
         front=(front+1)%capacity;
         count--;
     }
     // Enqueue is used to insert the element in the queue
     public void enqueue(int item){
         if(isFull()){
             System.out.println("Overflow \n Program Terminated");
             System.exit(1);
         }
         System.out.println("Inserting "+ item);
         rear=(rear+1)%capacity;
         arr[rear]=item;
         count++;
     }
     public int peek(){
         if(isEmpty()){
             System.out.println("Underflow \n Program Terminated");
             System.exit(1);
         }
         return arr[front];
     }
     public int size(){
         return count;
     }
     public Boolean isEmpty(){
         return (size()==0);
     }
     public Boolean isFull(){
        return (size()==capacity);
     }


    public static void main(String[] args) {
        queuecode q=new queuecode(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("The front element is " + q.peek());
        q.dequeue();
        System.out.println("The front element is "+q.peek());
        System.out.println("The Size of the queue is "+q.size());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if(q.isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println("The queue is not empty");
        }

    }
    
}
