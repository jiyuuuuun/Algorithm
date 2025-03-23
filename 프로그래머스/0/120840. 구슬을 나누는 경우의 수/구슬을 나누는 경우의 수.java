import java.math.BigInteger;

class Solution {
 // BigInteger 팩토리얼 함수
    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // 조합 계산 함수: nCr = n! / ((n - r)! * r!)
    public int solution(int balls, int share) {
        BigInteger nFact = factorial(balls);
        BigInteger rFact = factorial(share);
        BigInteger nrFact = factorial(balls - share);

        BigInteger result = nFact.divide(rFact.multiply(nrFact));

        // 최종 결과를 int로 반환 (주의: overflow 가능)
        return result.intValue();
    }

} 