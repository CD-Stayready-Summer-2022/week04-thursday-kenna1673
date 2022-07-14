package com.codedifferently.problem03;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Integer[] stringToNumbers(String[] input){
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen",16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        int length = input.length;
        Integer[] nums = new Integer[length];
        for (int i = 0; i < length; i++) {
            String current = input[i];
            if (map.containsKey(current)) {
                nums[i] = map.get(current);
            }
        }
        return nums;
    }
}
