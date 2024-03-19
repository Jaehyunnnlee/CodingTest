import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int index=0;
        Arrays.fill(answer,0);
        Queue<Integer> priceQueue=new LinkedList<>();
        for(int i=0;i<prices.length;i++){
            priceQueue.add(prices[i]);
        }
        while(!priceQueue.isEmpty()){
            int num=priceQueue.poll();
            
            for(int price:priceQueue){
                answer[index]++;
                if(price<num){
                    break;
                }
            }
            index++;
        }
        
        return answer;
    }
}