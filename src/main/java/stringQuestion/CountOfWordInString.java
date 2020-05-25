package stringQuestion;

public class CountOfWordInString {


    public static void main(String[] args){
        String str = "Hello world my name is ruli";
        int countOfWord = str.split(" ").length;
        System.out.println(countOfWord);

    }
}
