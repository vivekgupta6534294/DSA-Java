//Implementing Stack 
package stackandqueue;
public class stackcode {
        private int maxsize;
        private int [] stackArray;
        private int top;
        public stackcode(int s){
            maxsize=s;
            stackArray= new int [maxsize];
            top=-1;
        }
    public void push(int j){
        stackArray[++top]=j;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return(top==maxsize-1);
    }

    public static void main(String[] args) {
        stackcode abc=new stackcode(5);
        abc.push(10);
        abc.push(20);
        abc.push(30);
        abc.push(40);
        abc.push(50);
        System.out.println(abc.isFull());
        while(!abc.isEmpty()){
            int value=abc.pop();
            System.out.print(value);
            System.out.println(" ");
            
        }
        
    }
}
