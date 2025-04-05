class Solution {
    public String solution(int n) {
        String answer = "";
        if(n>=2){
          int num1=n/2;
          for(int i=0;i<num1;i++){
            answer+="수박";
          }
          if(n%2==1){
            answer+="수";
          }
        }else{
          answer="수";
        }
 
        return answer;
    }
}