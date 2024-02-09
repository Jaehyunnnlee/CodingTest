

			/*
n편중 h번 이상 인용된 논문이 h편 이상 나머지는 h편 이하로 인용되었으면 H-index는 h의 최댓값

논문 n편 증, a번 이상 인용된 논문이 b편 이상이면 a 와 b중 작은 값이 hIndex 값입니다.

접근법  

key: 어떤 논문이 인용된 횟수
value: 인용된 횟수보다 많이 인용된 논문의 갯수

1.map에 citations[index] 값을 키로 초기화
2.map의 해당 key보다 크거나 같은 배열 값이 존재하면 해당 키의 value+1
3.map에 key와 value중 최솟값을 구함
4.최솟값중의 최댓값이 정답

*/
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0,max=Integer.MIN_VALUE,min=0;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<citations.length;i++){
            map.put(citations[i],0);
        }
        
        for(int i:map.keySet()){
            for(int j=0;j<citations.length;j++){
                if(i<=citations[j]){
                    map.put(i,map.get(i)+1);
                }
            }
        }
        
        for(int i:map.keySet()){
            min=Integer.min(i,map.get(i));
            max=Integer.max(max,min);
        }
        System.out.println(max);
        System.out.println(map);
        answer=max;
        return answer;
    }
}