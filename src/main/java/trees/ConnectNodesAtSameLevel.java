package trees;

import java.util.*;

public class ConnectNodesAtSameLevel {

    static Queue<BinaryTree.Node> connect(BinaryTree.Node node) {


        Queue<BinaryTree.Node> q = new java.util.LinkedList();

        q.add(node);
        q.add(null);
        BinaryTree.Node temp = null;

        while (!q.isEmpty()) {
            int count =1;
            int n = q.size() - count;
            temp = q.remove();
            for (int i = 0; i < n; i++) {

                if (temp.right != null) {
                    q.add(temp.right);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
            }
            count++;

            q.add(null);
        }
        return q;
    }

    public static void print(Queue<BinaryTree.Node> node){

        while (!node.isEmpty()){
            Optional<BinaryTree.Node> t = Optional.ofNullable(node.remove());
            System.out.println(t.map( v -> v.value + " -> ").orElse("\n"));

        }

    }
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(4);
        binaryTree.add(2);
        binaryTree.add(1);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);

        print(connect(binaryTree.root));



    }
}
