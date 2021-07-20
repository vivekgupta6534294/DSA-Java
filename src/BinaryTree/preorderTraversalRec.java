// Preorder Traversal of Binary Tree using Recursion
/* Construct the following tree
//Output : 1 2 4 3 5 7 8 6 
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */
package BinaryTree;

public class preorderTraversalRec {
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.right.left.left=new Node(7);
        root.right.left.right=new Node(8);
        preOrder(root);
    }
    
    
}
