import java.util.List;       
import java.util.ArrayList;  

class Solution {
    public List<Integer>solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for(int i=num_list.length-1;i>=0;i--){
           list.add(num_list[i]);
          
        }
        return list;
    }
}