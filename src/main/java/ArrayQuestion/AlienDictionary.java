package ArrayQuestion;

public class AlienDictionary {

    public static boolean isAlienSorted(String[] words, String order) {

        int[] alphaArr = new int[26];

        for(int i = 0; i < alphaArr.length; i ++){
            alphaArr[order.charAt(i) - 'a'] = i ;
        }

        for(int i = 0 ; i < words.length; i++){
            for(int j =  i + 1 ; j < words.length; j++){
                int min = Math.min(words[i].length(), words[j].length());
                if (words[i].length() > words[j].length()){
                    return false;
                }
                for (int k =0; k< min; k++){
                    char iChar = words[i].charAt(k);
                    char jChar = words[j].charAt(k);

                    if(alphaArr[iChar - 'a'] < alphaArr[jChar - 'a']){
                        break;
                    }else if(alphaArr[iChar - 'a'] > alphaArr[jChar - 'a']){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

       String[] words = new String[]{"hellodadas","leetcode"};
       String order = "hlabcdefgijkmnopqrstuvwxyz";

       isAlienSorted(words, order);

     }
}
