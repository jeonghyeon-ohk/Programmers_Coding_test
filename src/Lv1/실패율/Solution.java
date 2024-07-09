package Lv1.실패율;

import java.util.*;
class Solution {
    public static int[] solution(int N, int[] stages) {
        double[] fail = new double[N]; // 0 부터 N까지
        int[] answer = new int[N];

        for(int i=0; i<answer.length; i++)
            answer[i] = i+1;

        for(int num : stages){
            if(num <= N);
            fail[num-1]++;
        }

        for(int i=0; i<fail.length; i++){
            int sum = 0;
            for(int num : stages){
                if(num >= i+1) sum++;
            }
            if(fail[i] != 0)
                fail[i] /= sum;
        }

        for(int i=0 ;i<fail.length-1; i++){
            for(int j=0; j<fail.length-1-i; j++){
                if(fail[j] < fail[j+1]){
                    double temp = fail[j];
                    fail[j] = fail[j+1];
                    fail[j+1] = temp;

                    int temp2 = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] answer = solution(5, new int[]{2,1,2,6,2,4,3,3});

        for(int n : answer){
            System.out.print(n+" ");
        }
    }

}