package stringQuestion;

public class reverseString {

    public static void main(String[] args){
        String str = "ruli";
        StringBuffer reverseStr= new StringBuffer();
        for(int i = str.length() -1 ; i >= 0 ; i--){
            reverseStr.append(str.charAt(i));
        }
        System.out.println(reverseStr.toString());

    }
}
