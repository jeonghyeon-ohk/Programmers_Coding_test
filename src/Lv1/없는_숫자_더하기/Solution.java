package Lv1.없는_숫자_더하기;

class Solution {
    public int solution(int[] numbers) {
        boolean[] bool = new boolean[10];
        int answer = 0;

        for(int n : numbers){
            bool[n] = true;
        }

        for(int i=0; i<bool.length; i++){
            if(!bool[i])
                answer+=i;
        }

        return answer;
    }
}
