class Solution {
    public int solution(int num) {
        long n=num;
        int count=0;
        if(n==1){
            return 0;
        }
        do{
          if(n%2==0){
              n/=2;
          }else{
            n=n*3+1;
          }
           ++count; 
          if(n==1){
              break;
          }
        }while(count<500);
        
        if(n!=1){
            return -1;
        }
        return count;
    }
}