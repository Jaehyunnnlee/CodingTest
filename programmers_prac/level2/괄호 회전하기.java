import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<String> dq=new ArrayDeque<>();
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            dq.add(String.valueOf(s.charAt(i)));
        }
        for(int i=0;i<dq.size();i++){
            int check=0;
            //괄호의 회전
            dq.add(dq.poll());
            
            int countOpen=0,countClose=0;
            for(String str:dq){
                stack.add(str);
                //괄호의 갯수가 알맞게 짝지어졌는지 판별
                if(str.equals("(")||str.equals("{")||str.equals("[")){
                    countOpen++;
                }
                else if(str.equals(")")||str.equals("}")||str.equals("]")){
                    countClose++;
                }
                //괄호가 알맞게 짝지어졌는지 판별
                if(str.equals(")")){
                    stack.pop();
                    if(stack.isEmpty()){
                        check++;
                        break;
                    }
                    else if(stack.peek().equals("{")){
                        check++;
                        break;
                    }
                    else if(stack.peek().equals("[")){
                        check++;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                
                if(str.equals("}")){
                    stack.pop();
                    if(stack.isEmpty()){
                        check++;
                        break;
                    }
                    else if(stack.peek().equals("(")){
                        check++;
                        break;
                    }
                    else if(stack.peek().equals("[")){
                        check++;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(str.equals("]")){
                    stack.pop();
                    if(stack.isEmpty()){
                        check++;
                        break;
                    }
                    
                    else if(stack.peek().equals("{")){
                        check++;
                        break;
                    }
                    else if(stack.peek().equals("(")){
                        check++;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
                
            // System.out.println(stack);
            // System.out.println(dq);
            // System.out.println(check);
            stack.clear();
            if(check>0||countOpen!=countClose||stack.contains(")")||stack.contains("}")||stack.contains("]")){
                continue;
            }
            answer++;
        }
        return answer;
    }
}