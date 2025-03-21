import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] keys = new int[emergency.length];
        Integer[] emergencys = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        for(int i=0;i<emergency.length;i++){
         int max = Arrays.stream(emergency).max().getAsInt();
          keys[Arrays.asList(emergencys).indexOf(max)]=i+1;
          emergency[Arrays.asList(emergencys).indexOf(max)]=-1;
        
        }
        return keys;
        
    }
}