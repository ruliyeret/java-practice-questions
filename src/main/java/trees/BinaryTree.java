package trees;


public class BinaryTree {

    Node root;

    BinaryTree(int value){
       root = new Node(value);
    }

    BinaryTree(){

    }


    public static class Node{
      int value;
      Node left;
      Node right;

      public Node(int value){
          this.value =  value;
          left = null;
          right = null;
      }

        @Override
        public String toString() {
            return "Key: " + value;
        }
    }

    private Node insertValue(Node node, int value){

        if(node == null){
            return new Node(value);
        }
        if(value > node.value){
            node.right = insertValue(node.right, value);
        }
        else if(value < node.value){
            node.left = insertValue(node.left, value);
        }
         //value already exist
        else {
            return node;
        }
        return node;
    }

    public void add(int value){
        this.root = insertValue(root, value);
    }

    private  Node findElement(Node current, int value){
        if(current == null){
            return null;
        }

        if(current.value < value){
            current.right = findElement(current.right, value);
        }
        else if(current.value > value){
            current.right = findElement(current.left, value);
        }

        return  current;
    }

    public Node find(int value){
            return findElement(root, value);
    }

    public void inOrderTraversal(Node currentNode){

        if(currentNode != null){
            inOrderTraversal(currentNode.left);
            System.out.println(currentNode);
            inOrderTraversal(currentNode.right);
        }
    }
    public void preOrderTraversal(Node currentNode){

        if(currentNode != null){
            System.out.println(currentNode);
            preOrderTraversal(currentNode.left);
            preOrderTraversal(currentNode.right);
        }
    }

    public void postOrderTraversal(Node currentNode){

        if(currentNode != null){
            postOrderTraversal(currentNode.left);
            postOrderTraversal(currentNode.right);
            System.out.println(currentNode);
        }
    }

    Node sortedArrayToBST(int arr[], int start, int end) {

        /* Base Case */
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = sortedArrayToBST(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

}
