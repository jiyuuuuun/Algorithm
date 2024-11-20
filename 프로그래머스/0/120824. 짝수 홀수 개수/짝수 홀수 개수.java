import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int even=0;
        int odd=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                even++;
            }else{
                odd++;
            }
            
        }
        answer.add(even);
        answer.add(odd);
        return answer;
    }
}