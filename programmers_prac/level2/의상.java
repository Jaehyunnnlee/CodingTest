import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
/*
(아무것도 안입는)0~옷의 갯수로 경우의수를 정함(+1하는 이유)
모두 0일 경우인 하나를 모든 경우의 수에서 빼줌(모두 안입으면 안되니까)
*/
        int answer = 1;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            for(int j=clothes[0].length-1;j>=0;j--){
                if(j==0){
                   map.put(clothes[i][1],map.get(clothes[i][1])+1);
                }
                else if(j==1){
                    if(!map.containsKey(clothes[i][1])){
                        map.put(clothes[i][1],0);
                    }
                }
            }
        }
        
        for(Integer i:map.values()){
            answer*=(i+1);
        }
        answer-=1;
        return answer;
    }
}