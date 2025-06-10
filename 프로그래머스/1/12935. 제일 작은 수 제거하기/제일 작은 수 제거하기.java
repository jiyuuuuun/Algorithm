import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        if(arr.length == 1){
            answer.add(-1);
            return answer;
        }
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
        }

        for (int num : arr) {
            if (num != min) {
                answer.add(num);
            }
        }

        return answer;
    }
}