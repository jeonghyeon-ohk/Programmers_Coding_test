package Lv1.나누어_떨어지는_숫자_배열;

import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> intList = new ArrayList<>();

        for(int n : arr){
            if(n%divisor == 0){
                intList.add(n);
            }
        }

        Collections.sort(intList);



        return intList.size() == 0
                ? new int[]{-1}
                : intList.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}