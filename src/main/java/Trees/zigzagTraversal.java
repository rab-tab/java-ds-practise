package Trees;

import java.util.Stack;

public class zigzagTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        zigzag(tree.root);
    }


    public static void zigzag(Node root)
    {
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                Node temp=s1.peek();
                System.out.println(temp.data);
                s1.pop();
                if(temp.right!=null) s2.push(temp.right);
                if(temp.left!=null) s2.push(temp.left);
            }

            while(!s2.isEmpty())
            {
                Node temp=s2.peek();
                System.out.println(temp.data);
                s2.pop();
                if(temp.left!=null) s1.push(temp.left);
                if(temp.right!=null) s1.push(temp.right);

            }
        }

    }
}
