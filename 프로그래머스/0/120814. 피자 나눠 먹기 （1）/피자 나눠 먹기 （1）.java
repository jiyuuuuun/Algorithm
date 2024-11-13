class Solution {
    public int solution(int n) {
        int z=n;
        int i;
        for(i=1;i<n;i++){
            z-=7;
            if(z<=0)
                break;
        }
        return i;
    }
}