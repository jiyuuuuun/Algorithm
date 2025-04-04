class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int digitCount = str.length();
        int[] answer = new int[digitCount];
        char[] chars = str.toCharArray();
        int num=0;
        for(int i=digitCount-1;i>=0;i--){
            answer[i]=chars[num++]- '0';
        }
        return answer;
    }
}