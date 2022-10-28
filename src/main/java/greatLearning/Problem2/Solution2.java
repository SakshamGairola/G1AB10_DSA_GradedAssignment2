package greatLearning.Problem2;

public class Solution2 {
    private Node root = null;

    public Solution2() {
        int[] data = {15, 10, 5, 20, 25, 17, 12};
        Node root = null;
        Tree tree = new Tree();

        //create a tree
        root = tree.createTree(data);


        //modifies the tree

        //tree.modifyTree(root);
        tree.some(root);

        //tree.printTree(root);


    }
}
