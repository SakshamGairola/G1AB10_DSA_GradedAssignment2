package greatLearning.Problem2;

public class Tree {

    Node createTree(int[] data){
        Node root=null;
        for(int i : data){
            root = insertNode(root, i);
        }
        return root;
    }

    Node insertNode(Node node, int data){
        Node newNode = new Node(data);
        if(node == null){
            return newNode;
        }
        if(newNode.data < node.data){
            if(node.left == null){
                node.left = newNode;
            }else {
                insertNode(node.left, newNode.data);
            }
        } else if (newNode.data > node.data) {
            if(node.right == null){
                node.right = newNode;
            }else {
                insertNode(node.right, newNode.data);
            }
        }else {
            System.out.println("Duplicate Value: " + data);
        }
        return node;
    }
    static Node headNode = null;
    static Node prevNode = null;

    void some(Node root){
//        System.out.println("Before:");
//        printTree(root);
        modifyTree(root);
        //System.out.println("After:");
        printTree(root);
    }

    void modifyTree(Node root){
        if(root == null){
            return;
        }
        modifyTree(root.left);

        Node leftNode = root.left;
        Node rightNode = root.right;

        if (headNode == null){
            headNode = root;
            root.left = null;
            prevNode = root;
        }else{
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
//        root.left = null;
//        prevNode = root;
        modifyTree(rightNode);
    }
    void printTree(Node root){
        if (root == null)
            return;
        //Pre-Order
        //System.out.print(root.data + " ");
        printTree(root.left);
        //In-Order
        System.out.print(root.data + " ");
        printTree(root.right);
        //Post-Order
        //System.out.print(root.data + " ");
    }
}

