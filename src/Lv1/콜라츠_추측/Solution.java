package Lv1.콜라츠_추측;

class Solution {
    public int solution(int n) {
        long m = (long) n;
        int count = 0;

        while(count <= 500){
            if(m==1) return count;

            m = m%2==0 ? m/2 : m*3 + 1 ;

            count++;
        }

        return -1;
    }
}
