import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0,index = 0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
        }
        while(index<=discount.length-10){
            // System.out.println(map);
            for(int i=index;i<index+10;i++){
             if(map.containsKey(discount[i])){
                map.put(discount[i],map.get(discount[i])-1);
                    if(map.get(discount[i])==0){
                        map.remove(discount[i]);
                    }
                }
            }
            // System.out.println(index);
            // System.out.println(map);
            if(map.isEmpty()){
                answer++;
            }
            for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
            }
            index+=1;
        }
        return answer;
    }
}