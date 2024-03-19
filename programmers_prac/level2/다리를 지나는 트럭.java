import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0,bridge_weight=0,complete_truck=0,bridge_count=0;
        Queue<Integer> timeQueue=new LinkedList<>();
        Queue<Integer> progressQueue=new LinkedList<>();
        Queue<Integer> waitQueue=new LinkedList<>();
        for(int i=0;i<truck_weights.length;i++){
            waitQueue.add(truck_weights[i]);
        }
        
        while(complete_truck!=truck_weights.length){
            answer++;
            if(timeQueue.peek()!=null&&timeQueue.peek()==bridge_length){
                timeQueue.poll();
                bridge_weight-=progressQueue.poll();
                bridge_count--;
                complete_truck++;
            }
            if(waitQueue.peek()!=null){
                int truck=waitQueue.peek();
                if(bridge_weight+truck<=weight&&bridge_count<=bridge_length){
                    bridge_weight+=truck;
                    bridge_count++;
                    timeQueue.add(0);
                    progressQueue.add(waitQueue.poll());
                }
            }
            for(int i=0;i<timeQueue.size();i++){
                timeQueue.add(timeQueue.poll()+1);
            }
        }
        return answer;
    }
}