import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        int num=1;
        
        HashMap<String,Integer> partMap=new HashMap<>();
        for(int i=0;i<participant.length;i++){
            if(!partMap.containsKey(participant[i])){
                partMap.put(participant[i],num);
            }
            else{
                partMap.replace(participant[i],partMap.get(participant[i])+1);
            }
        }
        
       for(int i=0;i<completion.length;i++){
           if(partMap.containsKey(completion[i])){
               partMap.replace(completion[i],partMap.get(completion[i])-1);
           }
       }
       
        for(int i=0;i<participant.length;i++){
            if(partMap.get(participant[i])==1){
                answer=participant[i];
            }
        }
        
        return answer;
    }
}
