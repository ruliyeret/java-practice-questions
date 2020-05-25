package ArrayQuestion;

import java.util.Arrays;

public class ZeroMatrix {


    private static final int ROW = 4 ;
    public static boolean[] ignoreRow = new boolean[ROW];
    private static final int COL = 4 ;
    public static boolean[] ignoreCol = new boolean[COL];

    public static void markZeroPosition(int[][] arr){
        Arrays.fill(ignoreCol, false);
        Arrays.fill(ignoreRow, false);
        for (int i =0; i < ROW; i++){
//            if(ignoreCol[i]){
//                continue;
//            }
            for (int j=0; j < COL; j++){
//                if(ignoreRow[j]){
//                    continue;
//                }
                if(arr[i][j] == 0){
                    ignoreCol[j] = true;
                    ignoreRow[i] = true;
                }
            }
        }
    }

    public static void changeToZero(int[][] arr){
        for (int i =0; i < ROW; i++){
            for(int j =0;  j < COL; j++){
                if(ignoreCol[j] || ignoreRow[i]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){

        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 0, 7, 8 },
                { 9, 10, 0, 12 },
                { 13, 14, 0, 16 }
        };

        markZeroPosition(mat);
        changeToZero(mat);
        Utils.printMat(mat, 4, 4);


    }
}
