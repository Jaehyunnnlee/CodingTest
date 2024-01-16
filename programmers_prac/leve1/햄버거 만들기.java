import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        String burger="1231";
        StringBuilder sb = new StringBuilder();
        
        for(int i:ingredient){
            sb.append(String.valueOf(i));
            if(sb.length()>3&&sb.subSequence(sb.length()-4,sb.length()).equals(burger)){
                sb.replace(sb.length()-4,sb.length(),"");
                answer++;
            }
        }
        return answer;
    }
}