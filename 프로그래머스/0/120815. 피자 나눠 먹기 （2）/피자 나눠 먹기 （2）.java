class Solution {
    public int solution(int n) {
        int i;
        for(i=1;i<=n;i++){
            if((i*6)%n==0) 
                break;
        }
        
        return i;
    }
}