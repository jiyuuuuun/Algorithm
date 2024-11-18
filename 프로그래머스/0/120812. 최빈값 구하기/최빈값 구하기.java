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
    
    
        
    int max = Collections.max(map.values());
    int cnt=0; //최빈값 개수 카운트
    int result=0; 
        
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue()==max){
            cnt++;
            result=entry.getKey();
        }
    }
        return cnt == 1 ? result : -1 ;
    }
}


