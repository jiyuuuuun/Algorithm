class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] words=letter.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals(".-")){
                answer+="a";
            }else if(words[i].equals("-...")){
                answer+="b";
            }else if(words[i].equals("-.-.")){
                answer+="c";
            }else if(words[i].equals("-..")){
                answer+="d";
            }else if(words[i].equals(".")){
                answer+="e";
            }else if(words[i].equals("..-.")){
                answer+="f";
            }else if(words[i].equals("--.")){
                answer+="g";
            }else if(words[i].equals("....")){
                answer+="h";
            }else if(words[i].equals("..")){
                answer+="i";
            }else if(words[i].equals(".---")){
                answer+="j";
            }else if(words[i].equals("-.-")){
                answer+="k";
            }else if(words[i].equals(".-..")){
                answer+="l";
            }else if(words[i].equals("--")){
                answer+="m";
            }else if(words[i].equals("-.")){
                answer+="n";
            }else if(words[i].equals("---")){
                answer+="o";
            }else if(words[i].equals(".--.")){
                answer+="p";
            }else if(words[i].equals("--.-")){
                answer+="q";
            }else if(words[i].equals(".-.")){
                answer+="r";
            }else if(words[i].equals("...")){
                answer+="s";
            }else if(words[i].equals("-")){
                answer+="t";
            }else if(words[i].equals("..-")){
                answer+="u";
            }else if(words[i].equals("...-")){
                answer+="v";
            }else if(words[i].equals(".--")){
                answer+="w";
            }else if(words[i].equals("-..-")){
                answer+="x";
            }else if(words[i].equals("-.--")){
                answer+="y";
            }else if(words[i].equals("--..")){
                answer+="z";
            }
        }
        return answer;
    }
}