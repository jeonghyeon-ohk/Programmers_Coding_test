package Lv1.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long sum=0;

        for(long i=Math.min(a,b); i<=Math.max(a,b); i++)
            sum+=i;

        return sum;
    }
}
