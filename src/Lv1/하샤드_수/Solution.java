package Lv1.하샤드_수;

class Solution {
    public boolean solution(int x) {
        int div = 0, temp = x;

        while(temp>0){
            div += temp%10;
            temp/=10;
        }


        return x%div==0 ? true : false;
    }
}