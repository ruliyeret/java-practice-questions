package search;

import java.util.Arrays;

public class MergeSort {
    private static  void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void merge(
            int[] arr, int[] leftArr, int[] rightArr) {

        System.out.println("merge function");
        printArr(leftArr);

        printArr(rightArr);

        int i = 0, j = 0, k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }



        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }

        System.out.println("arr for now: " );
        printArr(arr);
    }

    private static int[] mergeSort(int[] arr, int n){

        if(n < 2){
            return arr;
        }
        int mid = n / 2;

        int[] left  = Arrays.copyOfRange(arr, 0, mid);
        int[] right  = Arrays.copyOfRange(arr, mid, n);
        System.out.print("left arr ");
        printArr(left);
        System.out.print("right arr ");
        printArr(right);

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(arr, left, right);

        return arr;
    }



    public static void main(String[] args){

        int[] arr = {11,8,4,2,7,3};

        mergeSort(arr, arr.length);



    }
}
