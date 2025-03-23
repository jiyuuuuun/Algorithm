class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rspArray=rsp.split("");
        for(int i=0;i<rspArray.length;i++){
            if(rspArray[i].equals("2")){
                answer+="0";
            }else if(rspArray[i].equals("0")){
                answer+="5";
            }else if(rspArray[i].equals("5")){
                answer+="2";
            }
        }
        return answer;
    }
} 