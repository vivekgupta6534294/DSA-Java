package temp;
import java.io.IOException;
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) throws IOException{
      Scanner sc=new Scanner(System.in);
      int a;
      a=sc.nextInt();
      if(a%2!=0 && a>0){
        System.out.print("YES");
      }
      else 
      System.out.println("NO");
      sc.close();
    }
}