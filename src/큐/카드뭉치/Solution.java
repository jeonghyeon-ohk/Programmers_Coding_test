package 큐.카드뭉치;
import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        String answer = "Yes";

        for(String s : cards1){
            queue1.add(s);
        }

        for(String s : cards2){
            queue2.add(s);
        }

        for(String s : goal){
            if(!queue1.isEmpty() && queue1.peek().equals(s)){
                queue1.poll();
            }
            else if(!queue2.isEmpty() && queue2.peek().equals(s)){
                queue2.poll();
            }
            else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
// 큐 없이 구현
//class Solution {
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        String answer = "Yes";
//        int index1,index2,indexGoal;
//
//        index1=index2=indexGoal=0;
//
//        for(String str : goal){
//
//            if(index1 < cards1.length && str.equals(cards1[index1])){
//                index1++;
//            }
//            else if(index2 < cards2.length && str.equals(cards2[index2])){
//                index2++;
//            }
//            else{
//                answer = "No";
//                break;
//            }
//
//        }
//
//        return answer;
//    }
//}

