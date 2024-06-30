package Lv1.자연수_뒤집어_배열로_만들기;

import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        String[] arr = sb.reverse().toString().split("");
        int[] answer = new int[arr.length];

        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
