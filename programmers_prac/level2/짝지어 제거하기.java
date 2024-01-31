import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<String> stack=new Stack<>();
        //마지막에 들어온 문자와 그전에 있는 마지막 문자를 비교 후 같으면 pop 두번 실행
        for(int i=0;i<s.length();i++){
            stack.add(String.valueOf(s.charAt(i)));
            if(stack.size()>=2&&stack.get(stack.size()-2).equals(String.valueOf(s.charAt(i)))){
                stack.pop();
                stack.pop();
            }
        }
        if(stack.size()>0){
            answer=0;
        }
        else{
            answer=1;
        }

        return answer;
    }
}