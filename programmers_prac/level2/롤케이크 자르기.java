import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<topping.length;i++){
            if(map.containsKey(topping[i])){
                map.put(topping[i],map.get(topping[i])+1);
            }
            else{
                map.put(topping[i],1);
            }
        }
        
        
        for(int i=topping.length-1;i>=0;i--){
            if(map2.containsKey(topping[i])){
                map2.put(topping[i],map.get(topping[i]+1));
                map.put(topping[i],map.get(topping[i])-1);
                if(map.get(topping[i])==0){
                    map.remove(topping[i]);
                }
            }
            else{
                map2.put(topping[i],1);
                map.put(topping[i],map.get(topping[i])-1);
                if(map.get(topping[i])==0){
                    map.remove(topping[i]);
                }
            }
            if(map.size()==map2.size()){
                answer++;
            }
        }

        return answer;
    }
}