class Solution {
    public int solution(int slice, int n) {
        int i;
        int z=n;
        for(i=1;i<n;i++){
            z-=slice;
            if(z<=0)
                break;
        }
        
        return i;
    }
}