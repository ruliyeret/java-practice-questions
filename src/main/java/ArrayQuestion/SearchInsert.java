package ArrayQuestion;

import java.util.Arrays;

public class SearchInsert {


    public static int findElement(int[] arr, int start, int end, int target){
        int mid = (start + end) / 2;

        if(start < end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return findElement(arr, mid + 1, end, target);
            }
            return findElement(arr, start, mid, target);

        }
        return mid;
    }
    public static int searchInsert(int[] nums, int target) {

       return findElement(nums, 0, nums.length, target);
    }

    public static void main(String[] args) {
        int [] arr = {1,5,9,13};

        System.out.println(searchInsert(arr, 1  ));
        System.out.println(searchInsert(arr, 2  ));
        System.out.println(searchInsert(arr, 11  ));
        System.out.println(searchInsert(arr, 14  ));
        System.out.println(searchInsert(arr, 0  ));

    }
}
