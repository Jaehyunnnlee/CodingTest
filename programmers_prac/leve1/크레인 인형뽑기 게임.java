import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        int n=0, count=0;
    
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                //System.out.print(board[j][i]+" ");
            }
          //System.out.println();
        }
        //System.out.println();
 
        for(int e:moves){
            for(int j=0;j<board.length;j++){
                if(board[j][e-1]>0){
                    stack.add(board[j][e-1]);
                }
            }
            //System.out.print(e+"번째"+"stack1= "+stack+"\n");
            if(!stack.isEmpty()){
                stack2.add(stack.get(0));
            }
            //System.out.println(stack.size());
            n=stack.size();
            if (n>0) {
                board[board.length-n][e-1] = 0;
            }
            
            if(stack2.size()>=2&&stack2.get(stack2.size()-1)==stack2.get(stack2.size()-2)){
                stack2.pop(); 
                stack2.pop(); 
                count+=2;
            }
            //System.out.print("stack2= "+stack2+"\n");
            //System.out.println("----------------------------");
            stack.clear();
        }
        answer=count;
        return answer;
    }
}