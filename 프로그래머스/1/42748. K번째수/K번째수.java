import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
          int[] sliced=Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
          Arrays.sort(sliced); // 오름차순 정렬
          answer[i]=sliced[commands[i][2]-1];

        }
        return answer;
    }
}