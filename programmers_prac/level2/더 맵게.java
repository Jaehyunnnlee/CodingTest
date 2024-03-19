import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //minHeap
        //maxHeap은 PriorityQueue<Integer> pq=new PriorotyQueue<>(Collections.reverseO           rder())로 구현
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            pq.add(scoville[i]);
        }
        while(pq.peek()<K){
            int min=pq.remove();
            if(!pq.isEmpty()){
                int secondMin=pq.remove();
                int mix=min+(secondMin*2);
                pq.add(mix);
                answer++;
            }
            else{
                answer=-1;
                return answer;
            }
        }
        
        return answer;
    }
}