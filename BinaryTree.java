package Coding;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree(int rootVal) {
        root = new TreeNode(rootVal);
    }

    // Method to insert a node in the binary tree
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // Recursive method to insert a node in the binary tree
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);

        return root;
    }

    // Method to perform inorder traversal of the binary tree
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(50);

        // Insert nodes
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(tree.root);
    }
}

