import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
    
        // 1. 숫자를 문자열로 변환
        String nStr=Long.toString(n);
        
        // 2. 문자열을 Long 객체 배열로 변환
        Long[] nArray=new Long[nStr.length()];
        
        for(int i=0;i<nStr.length();i++){
            nArray[i]= (long) (nStr.charAt(i) - '0');
        }
        // 3. 내림차순 정렬
        Arrays.sort(nArray, Collections.reverseOrder());
        
        // 4. 정렬된 숫자들을 문자열로 결합
        StringBuilder sb = new StringBuilder();
        for (long num : nArray) {
            sb.append(num);
        }

        // 5. 문자열을 long으로 변환하여 반환
        long result = Long.parseLong(sb.toString());
        
        
        return result;
    }
}