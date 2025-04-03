class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=11;i++){
            int factorial=1;
            for(int j=i;j>=1;j--){
                factorial*=j;
            }
            if(factorial>n){
                answer=i-1;
                break;
            }
        }
        return answer;
    }
}