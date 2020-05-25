package ArrayQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {


    public static int singleNumberByBit(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    public int singleNumberByHashMap(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public int singleNumberBySet(int[] nums) {
        int sumOfSet = 0, sumOfNums = 0;
        Set<Integer> set = new HashSet();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;
        }
        return 2 * sumOfSet - sumOfNums;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,3,5,1};
        System.out.println(singleNumberByBit(arr));
    }
}
