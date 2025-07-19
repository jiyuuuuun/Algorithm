class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" "); // 문자열 배열로 나누기

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : sArr) {
            int num = Integer.parseInt(str); // 문자열을 숫자로 변환
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + " " + max; // 문자열로 조합
    }
}
