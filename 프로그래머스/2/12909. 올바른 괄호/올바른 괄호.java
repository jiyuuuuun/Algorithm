class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int num=0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i) == '('){
                  num++;
             }
             if(s.charAt(i) == ')' ){
                 num--;
                 if(num<0){
                     return false;
                 }
             }              
         }
        return num==0;
    }
}