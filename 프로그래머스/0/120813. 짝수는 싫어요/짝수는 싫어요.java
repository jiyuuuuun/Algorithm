class Solution {
    public int[] solution(int n) {
        // 홀수의 개수를 먼저 계산하여 배열 크기 정하기
        int size = (n + 1) / 2; // 홀수 개수
        int[] answer = new int[size];
        
        int index=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                answer[index]=i;
                index++;
            }
        }
        

        
        return answer;
    }
}