package ArrayQuestion;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        int findMissingPositiveNum = 1;

        for(int num: nums){
            if(num == findMissingPositiveNum){
                findMissingPositiveNum++;
            }
        }
        return  findMissingPositiveNum;
    }


    public static void main(String[] args) {
        int [] test1 = {1, 2 ,0};

        System.out.println("Test 1: " + firstMissingPositive(test1));
        int [] test2 = {3, 4 ,-1, 1};

        System.out.println("Test 1: " + firstMissingPositive(test2));

        int [] test3 = {7, 8 ,9, 11, 12};
        System.out.println("Test 1: " + firstMissingPositive(test3));

    }
}
