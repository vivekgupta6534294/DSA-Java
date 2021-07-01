// In the program i will Return the Size , Max element and Height and sum of the tree
package Tree;
import java.util.*;
public class BinaryTreeSizeMaxHeightSum {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node (int data,Node left,Node right){
          this.data=data;
          this.left=left;
          this.right=right;
        }
      }
      public static class Pair{
        Node node;
        int state;
        Pair (Node node , int state){
          this.node =node;
          this.state=state;
        }
      }
    //   public static void display(Node node){
    //     if(node==null){
    //       return;
    //     }
    //     String str="";
    //     str+=node.left==null?".":node.left.data+"";
    //     str+="<-"+ node.data+"->";
    //     str+=node.right==null?".":node.right.data+"";
    //     System.out.println(str);
    //     display(node.left);
    //     display(node.right);
    //   }
    public static int sum(Node node){
        if(node==null){
            return 0;
        }
        int lsm=sum(node.left);
        int rsm=sum(node.right);
        int tsm=lsm+rsm+node.data;
        return tsm;
    }
    public static int max(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(node.left);
        int rmax=max(node.right);
        int tmax=Math.max(Math.max(lmax,rmax),node.data);
        return tmax;
    }
    public static int size(Node node){
        if(node ==null){
            return 0;
        }
        int ls=size(node.left);
        int rs=size(node.right);
        int ts=ls+rs+1;
        return ts;
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        int th=Math.max(lh,rh)+1;
        return th;
    }

      public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=new Node(arr[0],null,null);
        Pair rtp=new Pair(root,1);
        Stack<Pair> st=new Stack<>();
        st.push(rtp);
        int idx=0;
        while(st.size()>0){
          Pair top=st.peek();
          if(top.state==1){
            idx++;
            if(arr[idx]!=null){
              top.node.left=new Node(arr[idx],null,null);
              Pair lp=new Pair(top.node.left,1);
              st.push(lp);
            }else{
              top.node.left=null;
            }
            top.state++;
            
          }else if(top.state==2){
            idx++;
            if(arr[idx]!=null){
              top.node.right=new Node(arr[idx],null,null);
              Pair rp=new Pair(top.node.right,1);
              st.push(rp);
            }else{
              top.node.right=null;
            }
            top.state++;
    
          }else{
            st.pop();
          }
    
        }
      //  display(root);
      int size=size(root);
      int max=max(root);
      int height=height(root);
      int sum=sum(root);
      System.out.println(" The size of tree is " +size);
      System.out.println("Max of this tree is " +max);
      System.out.println("The height of the tree is " +height);
      System.out.println("The sum of the tree is : " +sum);

      }
    
}
