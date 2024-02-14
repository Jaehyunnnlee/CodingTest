import java.util.*;
/*
접근법
1. progresses배열과 speeds배열을 이용해 완성까지 남은 일 수 계산
2. dq에 남은 일 수 넣어주고 count를 이용해 dq의 맨 앞 원소보다 크면 dq의 맨 앞 원소를 제거하고 그때 빠진 원소의 갯수를 list에 넣어줌
3. list를 배열로 변환
*/
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int count=0;
        int pop=0;
        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            progresses[i]=100-progresses[i];
            if(progresses[i]%speeds[i]!=0){
                progresses[i]/=speeds[i];
                progresses[i]+=1;
            }
            else {
                progresses[i]/=speeds[i];
            }
            dq.add(progresses[i]);
        }
        while(!dq.isEmpty()){
            pop=0;
            while((dq.peekFirst()<=count)){
                dq.removeFirst();
                pop++;
                if(dq.size()==0){
                    break;
                }
            }
            count++;
            if(pop!=0){
                list.add(pop);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}