package stringQuestion;

public class CheckIfStringPalindrome {

    public static boolean isPalindrome(String str){

        int i = 0;
        int j = str.length() - 1;

        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){

        String p = "aabbaa";
        System.out.println(p  + " is palindrome " + isPalindrome(p));

        String notP = "fdsf";
        System.out.println(notP  + " is palindrome " + isPalindrome(notP));
    }
}
