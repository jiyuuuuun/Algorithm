class Solution {
    public int solution(int n) {

        String num="";
        while(n>0){
            num+=(n%3)+"";
            n/=3;
        }
        // 뒤집힌 3진수 → 10진수
        int answer = 0;
        int power = 1;
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            answer += digit * power;
            power *= 3;
        }
        return answer;
    }
}