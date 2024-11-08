class Solution {
    public int solution(int[] array) {
        int n=array.length;
        
        // 버블 정렬 사용, 구현이 간단하지만 비효율적, 안정적 정렬
        // 배열을 여러 번 순회하며 인접한 원소들을 비교하고 교환
        for (int i = 0; i < n - 1; i++) {
            // 배열의 마지막 요소까지 비교하지 않음
            for (int j = 0; j < n - i - 1; j++) {
                // 인접한 두 값 비교 후 교환
                if (array[j] > array[j + 1]) {
                    // 값이 크면 자리를 바꿈
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[array.length/2];
    }
}