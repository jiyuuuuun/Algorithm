import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int money) {
        List<Integer> list = new ArrayList<>();
        int cup=money/5500;
        int change=money%5500;
        
        list.add(cup);
        list.add(change);
        return list;
    }
}