import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer=0,index = location;
    
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<priorities.length;i++){
            dq.add(priorities[i]);
        }
        while(!dq.isEmpty()){
            //System.out.println(dq);
            int max=Integer.MIN_VALUE;
            Iterator<Integer> iter=dq.iterator();
            while(iter.hasNext()){
                int n=iter.next();
                max=Integer.max(max,n);
            }
            int current=dq.poll();
            if(current>=max){
                answer++;
                if(index==0){
                    return answer;
                }
                index--;
            }
            else{
                dq.add(current);
                index--;
                if(index<0){
                    index=dq.size()-1;
                }
            }
            //System.out.println(index);
        }
        return answer;
    }
}