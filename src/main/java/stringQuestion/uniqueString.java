package stringQuestion;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class uniqueString {

    // Option 1
    static boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();

        // Using sorting
        // Arrays.sort() uses binarySort in the background
        // for non-primitives which is of O(nlogn) time complexity
        Arrays.sort(chArray);

        for (int i = 0; i < chArray.length - 1; i++) {
            // if the adjacent elements are not
            // equal, move to next element
            if (chArray[i] != chArray[i + 1])
                continue;

            else
                return false;
        }
        return true;
    }

    // Option 2 time complex o(n)
    public static boolean isUniqueChars(String str){
        if(str.length() > 128 ){
            return false;
        }

        Boolean[] arr = new Boolean[128];
        Arrays.fill(arr, false);
        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);
            if (arr[index] == true)
                return false;

            arr[index] = true;
        }

        /* No duplicates encountered, return true */
        return true;
    }

    // Option 3 using hashSet

    public static boolean checkUnique(String str){

        Set s =
                str.chars().mapToObj(c -> (char)c ).collect(Collectors.toSet());
        return  str.length() == s.size();
    }


    public static void main(String[] args){

        String str = "rulli";

        // O(n)
        System.out.println("Result using arr of boolean " +uniqueCharacters(str));

        // O(n)
        System.out.println("Result using set " + checkUnique(str));

        //O(nlogn) because using sort operation (binary sort or merge sort)
        System.out.println("Result using sort array " +isUniqueChars(str));


    }
}
