public class BinarySearchTree {
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insertion operation
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Deletion operation
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Search operation
    public boolean contains(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return searchRec(root.left, value);
        }

        return searchRec(root.right, value);
    }

    // Inorder traversal
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.value + " ");
            inOrderTraversalRec(root.right);
        }
    }

    // Preorder traversal
    public void preOrderTraversal() {
        preOrderTraversalRec(root);
        System.out.println();
    }

    private void preOrderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }

    // Postorder traversal
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
        System.out.println();
    }

    private void postOrderTraversalRec(Node root) {
        if (root != null) {
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Optional Enhancement: Find minimum value
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }
        Node minNode = findMinRec(root);
        return minNode.value;
    }

    private Node findMinRec(Node root) {
        if (root.left == null) {
            return root;
        }
        return findMinRec(root.left);
    }

    // Optional Enhancement: Find maximum value
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("The tree is empty.");
        }
        Node maxNode = findMaxRec(root);
        return maxNode.value;
    }

    private Node findMaxRec(Node root) {
        if (root.right == null) {
            return root;
        }
        return findMaxRec(root.right);
    }

    // Optional Enhancement: Check if the tree is balanced
    public boolean isBalanced() {
        return isBalancedRec(root);
    }

    private boolean isBalancedRec(Node root) {
        if (root == null) {
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1
                && isBalancedRec(root.left)
                && isBalancedRec(root.right);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}