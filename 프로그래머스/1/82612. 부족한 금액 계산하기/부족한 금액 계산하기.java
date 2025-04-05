class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total_price=0;
        for(long i=1;i<=count;i++){
            total_price+=(long)price*i;
        }
        if(money-total_price>=0){
            answer=0;
        }else{
            answer=(money-total_price)*-1;
        }
     
        return answer;
    }
}