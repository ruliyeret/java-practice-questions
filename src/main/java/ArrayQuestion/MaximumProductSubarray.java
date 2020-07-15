package ArrayQuestion;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProductSubArray = 1;
        int tempMax = Integer.MIN_VALUE;

        for (int num: nums){
            if(num * maxProductSubArray > maxProductSubArray) {
                maxProductSubArray = maxProductSubArray * num;
            } else {
                if(maxProductSubArray > tempMax){
                    tempMax = maxProductSubArray;
                }
                maxProductSubArray = num;
            }
        }

        return  maxProductSubArray > tempMax ? maxProductSubArray: tempMax;
    }

    public static void main(String[] args) {
        int [] test1 = {2, 3, -2, -4};

        System.out.println("Test 1: " + maxProduct(test1));
        int [] test2 = {3, 4 ,-1, 1};

        System.out.println("Test 1: " + maxProduct(test2));

        int [] test3 = {7, 8 ,9, -9, -10};
        System.out.println("Test 1: " + maxProduct(test3));
    }

}
