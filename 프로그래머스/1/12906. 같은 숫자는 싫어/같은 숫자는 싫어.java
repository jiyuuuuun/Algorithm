import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
       for(int i=0;i<arr.length;i++){
           if(i>=1){
               if(arr[i-1]==arr[i]){
                   continue;
               }
           }
           answer.add(arr[i]);
       }
        return answer;
    }
}