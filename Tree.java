package Coding;

import java.util.ArrayList;
import java.util.List;

class TreeNode1 {
    int val;
    List<TreeNode1> children;

    TreeNode1(int x) {
        val = x;
        children = new ArrayList<>();
    }
}

public class Tree {
    public static void main(String[] args) {
        // Create the tree
        TreeNode1 root = new TreeNode1(1);
        TreeNode1 node2 = new TreeNode1(2);
        TreeNode1 node3 = new TreeNode1(3);
        TreeNode1 node4 = new TreeNode1(4);
        TreeNode1 node5 = new TreeNode1(5);
        TreeNode1 node6 = new TreeNode1(6);
        TreeNode1 node7 = new TreeNode1(7);

        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        node3.children.add(node6);
        node3.children.add(node7);

        // Print the tree
        System.out.println("Tree:");
        printTree(root, 0);
    }

    // Method to print the tree
    public static void printTree(TreeNode1 node, int depth) {
        if (node == null) return;

        // Print current node
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(node.val);

        // Print children
        for (TreeNode1 child : node.children) {
            printTree(child, depth + 1);
        }
    }
}
