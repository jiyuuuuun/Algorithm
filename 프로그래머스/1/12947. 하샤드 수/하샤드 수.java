class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String xStr=String.valueOf(x);
        
        int num=0;
        
        for(int i=0;i<xStr.length();i++){
            num+=xStr.charAt(i)-'0';
        }
        if(x%num==0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}