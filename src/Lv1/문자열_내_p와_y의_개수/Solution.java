package Lv1.문자열_내_p와_y의_개수;

class Solution{
    boolean solution(String s) {
        char[] cArr = s.toUpperCase().toCharArray();
        int pCount = 0, yCount = 0;

        for (char c : cArr) {
            if (c == 'P') pCount++;
            if (c == 'Y') yCount++;
        }

        return pCount == yCount ? true : false;
    }
}