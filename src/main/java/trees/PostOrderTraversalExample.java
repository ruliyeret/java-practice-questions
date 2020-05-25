package trees;

public class PostOrderTraversalExample {

    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree(50);
        binaryTree.add(25);
        binaryTree.add(15);
        binaryTree.add(30);
        binaryTree.add(75);
        binaryTree.add(85);
        binaryTree.postOrderTraversal(binaryTree.root);
    }
}
