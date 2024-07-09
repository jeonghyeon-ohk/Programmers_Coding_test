package 큐.기능개발;

import java.util.*;
class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> progress = new ArrayDeque<>();
        Queue<Integer> speed = new ArrayDeque<>();
        int n = progresses.length;
        int first = 1;

        for(int i=0; i<n; i++){
            progress.add(progresses[i]);
            speed.add(speeds[i]);
        }

        while(true){
            int count = 0;
            while(!progress.isEmpty() && progress.peek() >= 100){
                progress.poll();
                speed.poll();
                count++;
                n--;
            }
            if(count>0){
                list.add(count);
            }
            if(n <= 0){
                break;
            }

            for(int i=0; i<n; i++){
                int p = progress.poll();
                int s = speed.poll();
                progress.add(p+s);
                speed.add(s);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] answer = solution(new int[]{95,90,99,99,80,99},new int[]{1,1,1,1,1,1});

        for(int n : answer)
            System.out.print(n+" ");
    }
}

