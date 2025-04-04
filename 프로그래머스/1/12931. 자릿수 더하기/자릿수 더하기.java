import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // int를 String으로 변환
        String numberStr = Integer.toString(n);

        // 자릿수 세기
        int digitCount = numberStr.length();
        
        for(int i=0;i<digitCount;i++){
            answer+=(numberStr.charAt(i))-'0';
        }

        return answer;
    }
}