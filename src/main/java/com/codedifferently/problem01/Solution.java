package com.codedifferently.problem01;

import java.util.*;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        Arrays.sort(allNumbers);
        int count = 0;
        int largest = 0;
        Set<Integer> consecutive = new TreeSet<>();
        Set<Integer> longest;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < allNumbers.length; i++) {
            if (i > 0 && allNumbers[i] == allNumbers[i - 1] + 1) {
                count++;
                consecutive.add(allNumbers[i - 1]);
                consecutive.add(allNumbers[i]);
            } else {
                map.put(consecutive.size(), consecutive);
                consecutive = new TreeSet<>();
                count = 1;
            }
            if (i == allNumbers.length - 1) {
                map.put(count, consecutive);
            }
            largest = Math.max(largest, count);

        }
        longest = map.get(largest);

        StringBuilder builder = new StringBuilder("Longest Set: {");
        for (Integer num : longest) {
            builder.append(num).append(" ");
        }
        String finalSet = builder.toString();
        finalSet = finalSet.trim();
        finalSet = finalSet + "}";
        return finalSet;
    }
}
