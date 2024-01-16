import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String,Integer> map=new HashMap<>();
        int num=0;
        
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String str:callings){
            num=map.get(str);
            String name=players[num-1];
            players[num-1]=str;
            players[num]=name;
            map.put(players[num],num);
            map.put(str,num-1);
        }
        
        //System.out.println(map);
        answer=players;
        return answer;
    }
}