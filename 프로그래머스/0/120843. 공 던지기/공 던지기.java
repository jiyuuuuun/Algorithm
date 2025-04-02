class Solution {
    public int solution(int[] numbers, int k) {
        int index = ((k - 1) * 2) % numbers.length;
        return numbers[index];
  }
}
//공을 시작점(0번 인덱스)에서 2칸씩 이동하면서 k-1번 이동

//k-1: 시작이 1번 사람이기 때문 (공을 들고 있음)

//*2: 한 명 건너뛰는 이동

//% numbers.length: 원형 구조이므로 배열을 벗어날 경우 처음으로 돌아가게 함