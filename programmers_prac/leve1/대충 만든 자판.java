import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> answerMap=new HashMap<>();
        int keyCount=0;
        int cal=0;
        
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                //System.out.print(keymap[i].charAt(j)+" ");
                keyCount++;
                map.putIfAbsent(keymap[i].charAt(j),keyCount);
            }
            
            for(int k=0;k<targets.length;k++){
                for(char ch:targets[k].toCharArray()){
                    if(map.containsKey(ch)){
                        if(answerMap.containsKey(ch)&&answerMap.get(ch)<map.get(ch)){
                            continue;
                        }
                        answerMap.put(ch,map.get(ch));
                    }
                    else{
                        continue;
                    }
                }
            }
            
            keyCount=0;
            map.clear();
        }
        System.out.println(answerMap);
        
        for(int i=0;i<targets.length;i++){
            count=0;
            for(char ch:targets[i].toCharArray()){
                System.out.print(ch);
                if(answerMap.containsKey(ch)){
                    count+=answerMap.get(ch);
                }
                else{
                    count=-1;
                    break;
                }
            }
            answer[i]=count;
            System.out.println();
            System.out.println(count);
        }
        return answer;
    }
}