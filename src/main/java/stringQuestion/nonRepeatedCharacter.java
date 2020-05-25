package stringQuestion;

import java.util.*;

public class nonRepeatedCharacter {

    public static void main(String[] args){
        String str= "abbavddc";
        char[] c = str.toCharArray();
        Set<Character> characterSet = new HashSet<Character>();

        for (int i=0; i< c.length; i++){
            if(characterSet.contains(c[i])){
                characterSet.remove(c[i]);
            }else{
                characterSet.add(c[i]);
            }
        }

        System.out.println(characterSet.iterator().next());


    }
}
