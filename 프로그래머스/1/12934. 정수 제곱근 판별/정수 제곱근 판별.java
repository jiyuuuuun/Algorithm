class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);

        if(sqrt == (long) sqrt){
            long next=(long)sqrt+1;
            return next*next;
        }else{
            return -1;
        }
    }
}