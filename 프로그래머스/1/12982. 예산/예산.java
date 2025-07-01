import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count=0;
        
        Arrays.sort(d);
        
        for(int i:d){
            answer+=i;
            if(answer>budget){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}