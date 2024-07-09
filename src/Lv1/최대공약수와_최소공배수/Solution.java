package Lv1.최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int x = Math.max(n,m);
        int y = Math.min(n,m);

        while(y>0){
            int temp = x%y;
            x = y;
            y = temp;
        }

        answer[0] = x;
        answer[1] = n*m / x;

        return answer;


    }
}
