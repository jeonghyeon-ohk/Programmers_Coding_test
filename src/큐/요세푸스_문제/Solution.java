package 큐.요세푸스_문제;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution{
    int solution(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        while(queue.size() > 1){

            for(int i=0; i<k-1; i++){
                    queue.add(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }
}

