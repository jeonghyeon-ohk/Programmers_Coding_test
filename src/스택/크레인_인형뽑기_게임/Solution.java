package 스택.크레인_인형뽑기_게임;

import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {

        int n = board.length;
        Deque<Integer>[] dollMachine = new ArrayDeque[n];

        for(int i=0; i<dollMachine.length; i++){
            dollMachine[i] = new ArrayDeque<>();
        }

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if(board[i][j] != 0){
                    dollMachine[j].push(board[i][j]);
                }
            }
        }

        Deque<Integer> basket = new ArrayDeque<>();
        int answer = 0;

        for(int move : moves){
            if(!dollMachine[move-1].isEmpty()){
                int doll = dollMachine[move-1].pop();

                if(!basket.isEmpty() && basket.peek() == doll){
                    basket.pop();
                    answer+=2;
                }
                else{
                    basket.push(doll);
                }
            }
        }
        return answer;
    }
}

