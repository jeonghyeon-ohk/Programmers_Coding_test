package Lv1.나머지가_1이_되는_수_찾기;

class Solution {
    public int solution(int n) {
        int x=1;

        while(true){
            if(n%x==1) break;
            x++;
        }
        return x;
    }
}