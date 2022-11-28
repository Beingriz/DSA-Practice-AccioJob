package Trees;

import java.util.LinkedList;
import java.util.Queue;
//Tree Construction

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
// Binary Tree Construction
class BinaryTree{
    TreeNode root;
    // Adding a Node to BST.
    public TreeNode addNode(TreeNode root, int val){
        // 1. Edge Case :  if Root is null  create a Node.
        if(root ==  null) return  new TreeNode(val);

        // if val is lesser than root. add to left Node.
        if(val < root.val)
            root.left = addNode(root.left, val);

        // if val is greater than root. add to right node
        if(val > root.val)
            root.right = addNode(root.right, val);

        // return
        return root;
    }

    // Preorder traversal
    public  void preOrderTraversal (TreeNode root){
        // EdgeCase
        if(root ==  null) return;
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root){
        // Edge Case
        if(root ==  null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    // Inorder Traversal
    public void inoderTraversal(TreeNode root){
        //Edge Case
        if(root == null) return;
        inoderTraversal(root.left);
        System.out.print(root.val  + " ");
        inoderTraversal(root.right);
    }

    // Level order Traversal
    public void levelOrderTraversal(TreeNode root){
        // Traverse Each Level and Print Each Node at that Level
        // this can be acheived using Queue Data Strucute.
        //1. Create queue
        Queue<TreeNode> q = new LinkedList<>();

        // 2. Add First Node into Q
        q.add(root);

        //3. Perform Operation untill queue is empty
        while(q.size()>0){
            // Get the size of queue for perform operation
            int count = q.size();

            for (int i = 0; i < count; i++) {
                TreeNode temp_root = q.poll();
                System.out.print(temp_root.val + " ");

                // if Present Node has Left or Right Nodes. add it queue
                if(temp_root.right!=null) q.add(temp_root.right);
                if(temp_root.left!=null) q.add(temp_root.left);
            }
            System.out.println();
        }
    }

    //Covert Sorted Array to Binary Tree
    public TreeNode arrayToBST(int[] arr, TreeNode root, int start, int end){
        // Get Mid
        int mid = (start + end) /2;
        //Edge Case
        if(root == null) return  new TreeNode(arr[mid]);
        if(arr[mid] < root.val)
            root.left = arrayToBST(arr, root.left, start, mid-1);
        if(arr[mid] > root.val) root.right = arrayToBST(arr, root.right, mid+1, end);
        return root;
    }
}
