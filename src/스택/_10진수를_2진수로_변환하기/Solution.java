package 스택._10진수를_2진수로_변환하기;

import java.util.Stack;

class Solution{
    public static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while(decimal>0){
            stack.push(decimal%2);
            decimal/=2;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(String.valueOf(stack.pop()));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
}
