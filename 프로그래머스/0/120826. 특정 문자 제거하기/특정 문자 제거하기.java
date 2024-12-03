class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
            for(char s:my_string.toCharArray()){
                if(s==letter.charAt(0)){//letter는 String이므로 char로 변경
                    continue;
                }else{
                    answer+=s;
                }
                 
            }
          return answer;   
        
        
        
    }
}