class Solution {
    public int solution(int a, int b, int n) {
        int newC=0;
        int total=0;
        //콜라 팔기 
        while(n>=a){
        newC=n/a*b;
        total+=newC;
        n=(n%a)+newC;
        }
        return total;
    }
}