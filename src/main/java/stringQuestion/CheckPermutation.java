package stringQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {


    // Option 1 using hash map
    public static boolean checkPermutation(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        Map<Character, Integer> countCharExist = new HashMap<>();

        first.chars().mapToObj(c -> (char)c ).forEach(c-> countCharExist.put(c,1));
        second.chars().mapToObj(c -> (char)c ).forEach(c-> {
            countCharExist.computeIfPresent(c, (key, value) ->value + 1);
        });

        for (int num:countCharExist.values()) {
            if(num != 2){
                return false;
            }
        }
        return true;
    }

    // Option 2 sort
    public static boolean checkPermutationBySort(String str1, String str2){

        if(str1.length()  != str2.length()){
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        // Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted strings
        for (int i = 0; i < str1.length(); i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
    }

    public static void main(String args[]){

        String str1 = "ruli";
        String str2 = "ruil";

        // o(1)
        System.out.println("Result using hash map " + checkPermutation(str1, str2));


        // O(nlogn)
        System.out.println("Result using sort arr " + checkPermutationBySort(str1, str2));
    }
}
