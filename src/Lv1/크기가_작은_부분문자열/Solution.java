package Lv1.크기가_작은_부분문자열;

import java.math.BigInteger;

// BigInteger 를 사용하여 풀이
class Solution {
    public int solution(String t, String p) {
        int tLength = t.length(),
            pLength = p.length();
        int count = 0;

        BigInteger bigP = new BigInteger(p);

        for(int i=0; i<tLength-pLength+1; i++){
            String str = t.substring(i,i+pLength);

            BigInteger bigT = new BigInteger(str);

            if(bigT.compareTo(bigP) <= 0){
                count+=1;
            }
        }
        return count;
    }
}

// long 타입으로 변환
//class Solution {
//    public int solution(String t, String p) {
//        int tLength = t.length(),
//                pLength = p.length();
//        int count = 0;
//
//        long longP = Long.parseLong(p);
//
//        for(int i=0; i<tLength-pLength+1; i++){
//            long longT = Long.parseLong(t.substring(i,i+pLength));
//
//            if(longT <= longP){
//                count+=1;
//            }
//        }
//        return count;
//    }
//}