package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        tree.addNode(root, 2);
        tree.addNode(root, 4);
        tree.addNode(root, 3);
        tree.addNode(root, 5);
        tree.preOrderTraversal(root);
        System.out.println("Post Ordr");
        tree.postOrderTraversal(root);
        System.out.println("Inorder Traversal");
        tree.inoderTraversal(root);
        System.out.println();
        System.out.println("Level Order Traversal of BT");
        tree.levelOrderTraversal(root);
    }

}
