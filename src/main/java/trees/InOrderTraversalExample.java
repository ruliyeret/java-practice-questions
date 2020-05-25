package trees;

public class InOrderTraversalExample {

    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree(5);
        binaryTree.add(4);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(9);
        binaryTree.inOrderTraversal(binaryTree.root);
    }
}
