package Trees;

public class BuildingBST {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        BinaryTree tree = new BinaryTree();
        // from Sorted tarray to Binary Tree
        System.out.println("Building Binary Tree from Sorted Array");
        tree.root = tree.arrayToBST(arr, 0, arr.length-1);

        System.out.println("Preorder Traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post order Traversal");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Item is " + (tree.search(tree.root, 7)== true? "Found" : "Not Found"));
    }
}

