class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(Character.isDigit(s.charAt(i))) {
              answer.append(s.charAt(i));
              continue;
          }else if(s.charAt(i)==' '){
             while(i<s.length() && s.charAt(i)==' '){
                answer.append(s.charAt(i));
                i++;
             }
            if (i < s.length()) {
                answer.append(Character.toUpperCase(s.charAt(i)));
                i++;
                // 나머지 글자 소문자로 추가
                while (i < s.length() && s.charAt(i) != ' ') {
                    answer.append(Character.toLowerCase(s.charAt(i)));
                    i++;
                }
            }
              i--; // for문에 의해 추가 증가되므로 조정
          }else if(i==0){
               answer.append(Character.toUpperCase(s.charAt(i)));
          } else if (s.charAt(i - 1) == ' ') {
               // 단어의 첫 글자 (공백 다음)
               answer.append(Character.toUpperCase(s.charAt(i)));
          } else {
               // 단어의 나머지
               answer.append(Character.toLowerCase(s.charAt(i)));
          }
        }
        return answer.toString();
    }
} 