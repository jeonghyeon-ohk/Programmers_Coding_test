package Lv1.문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        char[] charArr = s.toCharArray();

        for(char c : charArr){
            if(!Character.isDigit(c))
                return false;
        }

        return charArr.length == 4 || charArr.length == 6;
    }
}