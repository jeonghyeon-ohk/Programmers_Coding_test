package Lv1.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int number=left; number<=right; number++){
            int count = 0;

            for(int i=1; i<=Math.sqrt(number); i++){
                if(i*i == number){
                    count++;
                }
                else if(number%i == 0){
                    count+=2;
                }
            }

            answer += count % 2 == 0 ? number : (-1) * number;
        }

        return answer;
    }
}