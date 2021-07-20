
// Postorder Traversal of Binary Tree using Iteration
// OUTPUT 4 2 7 8 5 6 3 1
/* Construct the following tree
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

import java.util.Stack;
public class postOrderTraversalIte {
    public static void postorderIterative(Node root) {
        // Creating an empty stack and push the root node
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        // Creating another stack to store post order traversal
        Stack<Integer> out = new Stack<>();
        while (!stack.empty()) {
            // Pop a node from the stack and push the data into the output stack
            Node curr = stack.pop();
            out.push(curr.data);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        postorderIterative(root);

    }
}