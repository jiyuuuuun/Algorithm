import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        
    HashMap<Integer,Integer> map = new HashMap<> ();
    
    for(int i=0;i<=1000;i++){
       map.put(i,0);
    }
    for(int i=0;i<array.length;i++){
        int plus=map.get(array[i]);
        map.replace(array[i],++plus);
    }
    
    List<Integer> max=new List<>(Collections.max(map.values()));
        
    int answer = Collections.max(map.values());
        return answer;
    }
}


