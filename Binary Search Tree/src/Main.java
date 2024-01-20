public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Perform operations and demonstrate traversal
        System.out.println("Inorder Traversal:");
        bst.inOrderTraversal();

        System.out.println("Preorder Traversal:");
        bst.preOrderTraversal();

        System.out.println("Postorder Traversal:");
        bst.postOrderTraversal();

        System.out.println("Deleting node with value 30:");
        bst.delete(30);
        bst.inOrderTraversal();

        System.out.println("Searching for value 40: " + bst.contains(40));
        System.out.println("Searching for value 90: " + bst.contains(90));

        System.out.println("Minimum value in the tree: " + bst.findMin());
        System.out.println("Maximum value in the tree: " + bst.findMax());

        System.out.println("Is the tree balanced? " + bst.isBalanced());
    }
}
