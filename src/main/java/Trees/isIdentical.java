package Trees;

public class isIdentical {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        System.out.println(isIdenticalTree(tree.root,tree1.root));
    }

    public static boolean isIdenticalTree(Node root1,Node root2)
    {
        if(root1==null && root2==null) return false;
        if(root1==null || root2==null) return false;
        if(root1.data!=root2.data) return false;

        //check if left and right subtree is equal
        if(isIdenticalTree(root1.left,root2.left) && isIdenticalTree(root1.right,root2.right)) return true;
        return false;
    }
}
