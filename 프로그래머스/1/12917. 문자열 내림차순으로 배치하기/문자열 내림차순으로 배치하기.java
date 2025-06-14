import java.util.Arrays;
import java.util.Collections;

class Solution {
    public StringBuilder solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();
        
        // char[] → Character[] 변환
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            characters[i] = chars[i];
        }

        // 내림차순 정렬
        Arrays.sort(characters, Collections.reverseOrder());
        
        // 다시 문자열로 결합
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            sb.append(c);
        }
        
        return sb;
    }
}