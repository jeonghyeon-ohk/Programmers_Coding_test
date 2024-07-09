package 스택.올바른_괄호;

import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(')
                stack.push(c);
            else{
                if(stack.isEmpty() || stack.pop()==')')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
