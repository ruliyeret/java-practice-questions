package ArrayQuestion;

import java.util.*;

public class intersectionOofTwoArrays {


    public static void simpleAnswer(List<Integer> list1, List<Integer> list2 ){

        list1.forEach((element) -> {
            list2.forEach(element2 ->{
                if(element2 == element) {
                    System.out.println(element);
                }
            });
        });

    }

    private static void addArrToMap(List<Integer> arr, Map<Integer, Integer> map){
        arr.forEach(num->{
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1 );
            }else{
                map.put(num, 1 );
            }
        });
    }
    public static void complexAnswer(List<Integer> list1, List<Integer> list2 ){
        Map<Integer,Integer> countNumbersMap = new HashMap<>();
        addArrToMap(list1, countNumbersMap);
        addArrToMap(list2, countNumbersMap);

        countNumbersMap.forEach((key, value) ->{
            if(value > 1){
                System.out.println(key);
            }
        });

    }


    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1,2,4,5,8,0);
        List<Integer> arr2= Arrays.asList(9,70,4,5,22,0);

        // O(n2)
        simpleAnswer(arr1, arr2);

        //o(n)
        complexAnswer(arr1, arr2);



    }
}
