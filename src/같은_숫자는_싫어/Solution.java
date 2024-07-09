package 같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> intList = new ArrayList<>();
        int check=arr[0];
        intList.add(check);

        for(int n : arr){
            if(check==n)
                continue;

            intList.add(n);
            check = n;
        }

        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
}
