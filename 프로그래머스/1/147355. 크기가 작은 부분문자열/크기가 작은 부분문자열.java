class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long pNum = Long.parseLong(p); // 최대 18자리까지 OK

        for (int i = 0; i <= t.length() - plen; i++) {
            long subNum = Long.parseLong(t.substring(i, i + plen));
            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}