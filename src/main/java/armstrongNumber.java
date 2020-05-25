public class armstrongNumber {

    public static void main(String[] args) {
        int num = 371;
        int copyNum = num;
        int cubeNum = 0;
        while (num != 0){
            cubeNum = (int) (cubeNum + Math.pow((num %10),3));
            num = num /10;
        }

        System.out.println(cubeNum == copyNum);

    }
}
