package ArrayQuestion;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class JobScheduling {

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int prof = 0;
        int tempProfit = 0;
        int tempIndex = startTime[0];
        boolean begin = true;

        Set<Integer> startTimeSet = Arrays.stream(startTime).boxed().collect(Collectors.toSet());
        for (int startIndex = 0; startIndex < startTime.length; startIndex++) {

            if (startTime[startIndex] == tempIndex || begin) {
                prof += profit[startIndex];
                tempIndex = endTime[startIndex];
                begin = false;
            } else {
                continue;
            }

            if (!startTimeSet.contains(tempIndex)) {
                tempProfit = Math.max(tempProfit, prof);
                prof -= profit[startIndex];
                begin = true;
            }
        }

        return tempProfit;
    }

    public  static  int jobScheduling2(int[] startTime, int[] endTime, int[] profit) {
        int size = startTime.length;
        int[][] jobs = new int[size][3];
        for (int i = 0; i < size; ++i){
            //  0 -> startTime
            //  1 -> endTime
            //  2 -> profit
            int[] newJob = new int[]{startTime[i], endTime[i], profit[i]};
            jobs[i] = newJob;
        }

        // sort by endTime
        Arrays.sort(jobs, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);

        // key -> endTime
        // value -> maxProfit in the endTime
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(jobs[0][1], jobs[0][2]);
        int max = jobs[0][2];
        for (int i = 1; i < size; ++i){
            Integer index = treeMap.floorKey(jobs[i][0]);
            if (index == null){
                max = Math.max(max, jobs[i][2]);
            } else {
                max = Math.max(max, treeMap.get(index) + jobs[i][2]);
            }
            treeMap.put(jobs[i][1], max);
        }
        return max;
    }


    public static void main(String[] args) {
        int s1[] = {1, 2, 3, 4 ,6 };
        int e1[] = {3, 5, 10, 6 ,9 };

        int p1[] = {20, 500, 100, 70 ,60 };


        int s2[] = {1, 2, 3, 3 };
        int e2[] = {3, 4, 5, 6 };
        int p2[] = {50, 10,40,70 };

        int s3[] = {1, 1,1 };
        int e3[] = {2, 3, 4};
        int p3[] = {5, 6, 4};
        System.out.println(jobScheduling(s1, e1, p1));
        System.out.println(jobScheduling(s2, e2, p2));
        System.out.println(jobScheduling(s3, e3, p3));
    }
}
