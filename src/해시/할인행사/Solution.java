package 해시.할인행사;
import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {

        Map<String, Integer> wantMap = new HashMap<>();
        for(int i=0; i<want.length; i++){
            wantMap.put(want[i], number[i]);
        }

        int answer=0;
        for(int i=0; i<discount.length-9; i++){
            Map<String, Integer> disMap = new HashMap<>();

            for(int j=i; j<i+10; j++){
                disMap.put(discount[j], disMap.getOrDefault(discount[j],0)+1);
            }

            if(wantMap.equals(disMap)){
                answer++;
            }
        }


        return answer;
    }
}
