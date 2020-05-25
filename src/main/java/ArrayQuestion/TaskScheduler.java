package ArrayQuestion;

import java.util.*;

public class TaskScheduler {

    public static int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : tasks) {
            map.put(c, map.getOrDefault(c   , 0) + 1);
        }

        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>((a,b) -> b-a);
        maxPriorityQueue.addAll(map.values());
        int cycles = 0;
        while (!maxPriorityQueue.isEmpty()){

            List<Integer> tempList = new ArrayList<>();
            for(int i =0; i < n+1; i++){
                if(!maxPriorityQueue.isEmpty()){
                    tempList.add(maxPriorityQueue.remove());
                }
            }

            for(int i: tempList){
                if(--i > 0){
                    maxPriorityQueue.add(i);
                }
            }

            cycles += maxPriorityQueue.isEmpty() ? tempList.size() : n +1;
        }

        return cycles;
    }

    public static int leastInterval2(char[] tasks, int n) {

        int[] charArr = new int[26];

        for (char c: tasks) {
            charArr[c - 'A']++;
        }

        Arrays.sort(charArr);
        int maxVal = charArr[25] -1;
        int idle_slot = maxVal * n;

        for (int i = 24; i > 0; i--){
            idle_slot -= Math.min(charArr[i], maxVal);
        }

        return  idle_slot > 0 ? idle_slot + tasks.length : tasks.length;

    }

    public static void main(String[] args) {

       char[] tasks ="AAABBB".toCharArray();
        int n = 2;
        System.out.println(leastInterval2(tasks, n));
    }

}
