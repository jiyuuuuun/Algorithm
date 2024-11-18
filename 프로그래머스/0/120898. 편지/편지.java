class Solution {
    public int solution(String message) {
        int cnt=0;
        for(char m:message.toCharArray()){
            cnt++;
        }
        int answer = cnt*2;
        return answer;
    }
}