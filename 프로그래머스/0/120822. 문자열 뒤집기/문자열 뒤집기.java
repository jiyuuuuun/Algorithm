class Solution {
    public String solution(String my_string) {
        StringBuilder reversed = new StringBuilder(my_string);
        reversed.reverse();
        
        String answer=reversed.toString();
        return answer;
    }
}