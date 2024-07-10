package 해시.두_개의_수로_특정값_만들기;

import java.util.*;

class Solution{
    public static boolean solution(int[] arr, int target) {

        // 이중 반복문으로 모든 수를 더한 값을 해시에 매핑하자
        // 두개를 더한 숫자를 key, 두 숫자를 넣은 배열을 value로 사용하는 해시
        // 모든 값을 넣고
        // containsKey(target) 이 참인지 거짓인지 판단

        Set<Integer> set = new HashSet<>();

        for(int n : arr){
            if(set.contains(target-n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,8}, 6));
    }
}

