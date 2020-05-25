package trees;

public class SumOfNodes {

    public static int sumOfNodes(BinaryTree.Node node){

        if(node == null){
            return 0;
        }
        return (node.value += sumOfNodes(node.left) + sumOfNodes(node.right));
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(4);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(7);

        System.out.println("Sum of the nodes: " + sumOfNodes(binaryTree.root));

    }
}
