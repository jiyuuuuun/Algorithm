class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int j=1;j<=n;j++){
            if(n%j==0){
                answer+=j;
            }
        }      
        return answer;
    }
}