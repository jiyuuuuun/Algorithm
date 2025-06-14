class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6 ){
            // \\d는 하나의 숫자 의미
            // + 1개이상 반복
            // 숫자가 1개이상 있는 문자열 
            return s != null && s.matches("\\d+");
        }
        return answer;
    }
}