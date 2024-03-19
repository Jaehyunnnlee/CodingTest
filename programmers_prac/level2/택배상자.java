import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0,index=0,count=0;
        Stack<Integer> stack=new Stack<>();
        int itemNum=1;
        while(itemNum<=order.length){
            stack.push(itemNum);
            itemNum++;
            while(!stack.isEmpty()&&stack.peek()==order[index]){
                stack.pop();
                index++;
                answer++;
            }
        }
        //System.out.println(stack);
        return answer; 
    }
}