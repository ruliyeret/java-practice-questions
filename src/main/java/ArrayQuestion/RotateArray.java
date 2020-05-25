package ArrayQuestion;

public class RotateArray {

    public static void main(String[] args) {
        int [] arr = {1,6,7,3};
        rotate(arr, 3);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public  static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    // extra space
    private static int[] rotateWithExtraSpcae(int[] arr, int r) {

        int newArr[] = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            newArr[(i + r) % arr.length] = arr[i];
        }

        return newArr;
    }

}
