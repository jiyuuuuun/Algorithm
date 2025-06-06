class Solution {
    boolean solution(String s) {
        boolean answer = true;

        long countP=s.toLowerCase().chars().filter(c->c == 'p').count();
        long countY=s.toLowerCase().chars().filter(c->c == 'y').count();
        
        if(countP == countY){
            return true;
        }else{
            return false;
        }
    }
}