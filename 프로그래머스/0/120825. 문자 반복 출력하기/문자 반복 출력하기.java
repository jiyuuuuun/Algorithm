class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char nn:my_string.toCharArray())
           for(int i=0;i<n;i++){
            answer+=nn;
           }
        return answer;
        }
        
        
    }
