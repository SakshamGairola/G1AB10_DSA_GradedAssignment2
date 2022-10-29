package greatLearning.Problem2;

public class Tree {

    static Node headNode = null;
    static Node prevNode = null;

    // create BST from data array
    Node createTree(int[] data) {
        Node root = null;
        for (int i : data) {
            root = insertNode(root, i);
        }
        return root;
    }

    // insert a new node into the tree if exists else creates one
    Node insertNode(Node node, int data) {
        Node newNode = new Node(data);
        if (node == null) {
            return newNode;
        }
        if (newNode.data < node.data) {
            if (node.left == null) {
                node.left = newNode;
            } else {
                insertNode(node.left, newNode.data);
            }
        } else if (newNode.data > node.data) {
            if (node.right == null) {
                node.right = newNode;
            } else {
                insertNode(node.right, newNode.data);
            }
        } else {
            System.out.println("Duplicate Value: " + data);
        }
        return node;
    }

    // modifies the tree structure
    void modify(Node root) {
        if (root == null) {
            return;
        }
        modify(root.left);

        Node leftNode = root.left;
        Node rightNode = root.right;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
//        root.left = null;
//        prevNode = root;
        modify(rightNode);
    }

    Node modifyTree(Node root) {
        modify(root);
        return headNode;
    }

    // prints the tree in in-order(default), pre-order(1) or post-order(2)
    void printTree(Node root) {
        if (root == null)
            return;
        printTree(root.left);
        //In-Order
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    void printTree(Node root, int order) {
        if (root == null)
            return;

        if (order == 1) {//Pre-Order
            System.out.print(root.data + " ");
        }
        printTree(root.left, order);
        if (order == 0) {//In-Order
            System.out.print(root.data + " ");
        }
        printTree(root.right, order);
        if (order == 2) {//Post-Order
            System.out.print(root.data + " ");
        }
    }
}

