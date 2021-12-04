package Trees;

public class mirrorTree {
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

        System.out.println(isMirrorTree(tree.root,tree1.root));
    }


    public static boolean isMirrorTree(Node root1,Node root2)
    {
        if(root1==null && root2==null) return false;
        if(root1==null || root2==null) return false;
        if(root1.data!=root2.data) return false;

        //check if left and right subtree is equal
        if(isMirrorTree(root1.left,root2.right) && isMirrorTree(root1.right,root2.left)) return true;
        return false;
    }
}
