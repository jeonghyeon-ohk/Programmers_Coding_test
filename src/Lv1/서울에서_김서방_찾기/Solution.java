package Lv1.서울에서_김서방_찾기;

import java.util.*;
class Solution {
    public String solution(String[] seoul) {

        return String.format("김서방은 %d에 있다",Arrays.asList(seoul).indexOf("Kim"));

    }
}
