import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            nums.add(numbers[i]);
        }
        int fmax= Collections.max(nums);
        int index=nums.indexOf(fmax);
        nums.remove(index);
        int smax=Collections.max(nums);
        return fmax*smax;
    }

}