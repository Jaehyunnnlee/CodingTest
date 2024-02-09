import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0, count=0;
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],0);
        }
        for(int i=0;i<tangerine.length;i++){
            map.put(tangerine[i],map.get(tangerine[i])+1);
        }
        //System.out.println(map);
      
        while(count<k){
            int index=0;
            int max=Integer.MIN_VALUE;
            for(int i:map.values()){
                if(i>max){
                    max=i;
                }
            }
            for(int i:map.keySet()){
                if(map.get(i)==max){
                    count+=map.get(i);
                    map.replace(i,0);
                    //System.out.println(count);
                    answer++;
                }
                if(count>=k){
                    break;
                }
            }
        }
        // System.out.println(max);
        //System.out.println(map);
        return answer;
    }
}