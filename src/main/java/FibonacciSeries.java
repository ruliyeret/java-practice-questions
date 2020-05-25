public class FibonacciSeries {

    public static int getNumOfSeries(int n){

        if(n == 1 || n == 2){
            return 1;
        }else{
            return getNumOfSeries(n-1) + getNumOfSeries(n-2);
        }


    }
    public static void main(String[] args){

        int pos = 6;

        System.out.println(getNumOfSeries(pos));


    }
}
