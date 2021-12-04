package Trees;


public class treeHeight {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(height(tree.root));
    }

    public static int height(Node root)
    {
        if(root==null) return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);

        if(lheight>rheight)
            return lheight+1;
        else return rheight+1;
    }



}
