class Solution {
    public String solution(int age) {
        String ageString = String.valueOf(age);
        String answer="";
        for(int i=0;i<ageString.length();i++){
            if(ageString.charAt(i)=='0'){
                answer+="a";
            }else if(ageString.charAt(i)=='1'){
                answer+="b";
            }else if(ageString.charAt(i)=='2'){
                answer+="c";
            }else if(ageString.charAt(i)=='3'){
                answer+="d";
            }else if(ageString.charAt(i)=='4'){
                answer+="e";
            }else if(ageString.charAt(i)=='5'){
                answer+="f";
            }else if(ageString.charAt(i)=='6'){
                answer+="g";
            }else if(ageString.charAt(i)=='7'){
                answer+="h";
            }else if(ageString.charAt(i)=='8'){
                answer+="i";
            }else if(ageString.charAt(i)=='9'){
                answer+="j";
            }
        }
        
        return answer;
    }
}