//Finding the width of shadow of binary tree
/*          1
         /    \
        2       3
       / \     / \
      4   5   6   7
               \   \ 
                8   9  */
package BinaryTree;
// import java.util.*;

public class WidthOfShadowOFTree {    
    public static void main(String[] args) {
        Node root=new Node (1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.left.right=new Node(8);
        root.right.right.right=new Node(9);
        System.out.println(widthOfShadow(root));
        // widthOfShadow(root);
    }

    public static int widthOfShadow(Node root) {
        int arr[]=new int[2];
        width(root,0,arr);
        return arr[1]-arr[0]+1;
    }
    public static void width(Node root, int hl,int[] arr){
       
        
         if(root==null){
            return;
        }
         arr[0]=Math.min(arr[0],hl);
         arr[1]=Math.max(arr[1],hl);
         width(root.left,hl-1,arr);
         width(root.right,hl+1,arr);

    }
    
}
