package ArrayQuestion;


import java.util.HashSet;
import java.util.Set;

/*

Given an unsorted array return whether an
increasing subsequence of length 3 exists or not in the array.

Formally the function should:

Return true if there exists i, j, k
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Note: Your algorithm should run in O(n) time complexity and O(1) space complexity.
 */
public class IncreasingTripletSubsequence {



    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < minOne) {
                minOne = num;
            }

            if (num > minOne) {
                minTwo = Math.min(num, minTwo);
            }

            if (num > minTwo) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] test1 = {1,-6, -7,4,-3, 9};


        System.out.println("Test 1: " + increasingTriplet(test1));

        int[] test2 = {5, 4, 3, 2, 1};

        System.out.println("Test 2: " + increasingTriplet(test2));

//        int[] test1 = {1,2,3,4,5};
//
//        System.out.println("Test 1: " + isExist(test1));




    }
}
