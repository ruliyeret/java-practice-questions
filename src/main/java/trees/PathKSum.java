package trees;

import java.util.HashMap;

public class PathKSum {

    // option 1 Brute Force
    public static int countPathWithSum(BinaryTree.Node node, int sum){

        if(node == null){
            return 0;
        }

        int pathsFromRoot = countPathsWithSumFromNode(node, sum, 0);

        int pathFromLeft = countPathWithSum(node.left, sum);
        int pathFromRight = countPathWithSum(node.right, sum);

        return pathFromLeft + pathsFromRoot + pathFromRight;
    }

    public static int countPathsWithSumFromNode(BinaryTree.Node node, int targetSum, int currentSum){

        if(node == null){
            return 0;
        }
        currentSum += node.value;

        int totalPath = 0;
        if(currentSum == targetSum ){
            totalPath++;
        }

        totalPath += countPathsWithSumFromNode(node.right, targetSum, currentSum);
        totalPath += countPathsWithSumFromNode(node.left, targetSum, currentSum);


        return  totalPath;

    }


    // Option 2 Optimized
    public static int countPatbsWithSum(BinaryTree.Node root, int targetSum){
       return countPathsWithSum(root, targetSum, 0, new HashMap<Integer, Integer>());
    }

    private static int countPathsWithSum(BinaryTree.Node root, int targetSum, int runningSum, HashMap<Integer, Integer> map) {

        if(root == null){
            return 0;
        }
        runningSum += root.value;
        int sum = runningSum - targetSum;
        int totalPath =map.getOrDefault(sum, 0);
        if(runningSum == targetSum){
            targetSum++;
        }
        incrementHashTable(map, runningSum, 1);
        totalPath += countPathsWithSum(root.right, targetSum, runningSum, map);
        totalPath += countPathsWithSum(root.left, targetSum, runningSum, map);
        incrementHashTable(map, runningSum, -1);

        return totalPath;

    }

    private static void incrementHashTable(HashMap<Integer, Integer> map, int key, int delta) {
        int count = map.getOrDefault(key, 0) + delta;
        if (count == 0) {
            map.remove(key);
        } else {
            map.put(key, count);
        }
    }


    public static void main(String[] args) {
        BinaryTree.Node root = new BinaryTree.Node(1);
        root.left = new BinaryTree.Node(3);
        root.left.left = new BinaryTree.Node(2);
        root.left.right = new BinaryTree.Node(1);
        root.left.right.left = new BinaryTree.Node(1);
        root.right = new BinaryTree.Node(-1);
        root.right.left = new BinaryTree.Node(4);
        root.right.left.left = new BinaryTree.Node(1);
        root.right.left.right = new BinaryTree.Node(2);
        root.right.right = new BinaryTree.Node(5);
        root.right.right.right = new BinaryTree.Node(2);

        System.out.println(countPathWithSum(root, 5));

        System.out.println(countPatbsWithSum(root, 6));
    }

}
