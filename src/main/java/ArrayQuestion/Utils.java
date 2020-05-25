package ArrayQuestion;

public class Utils {

    public static void printMat(int[][] arr, int row, int col){

            for (int i =0; i < row; i++){
                for(int j =0;  j < col; j++){
                    System.out.print( arr[i][j] + " ");
                }
                System.out.println();
            }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
