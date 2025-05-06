import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        // 선수 이름 → 현재 인덱스
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String name : callings) {
            int idx = map.get(name);
            if (idx > 0) {
                // 순위 바꾸기
                String temp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = temp;

                // 위치 업데이트
                map.put(players[idx], idx);
                map.put(players[idx - 1], idx - 1);
            }
        }

        return players;
    }
}
