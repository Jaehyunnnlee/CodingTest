import java.util.*;
class Solution {
    //n을 2진수로 변환해주는 함수
    public String two(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }
    
    public int[] solution(String s) {
        int[] answer=new int[2];
        int countOne=0,countZero=0,count=0;
        Stack<String> stack=new Stack();
        
        for(int i=0;i<s.length();i++){
            stack.push(String.valueOf(s.charAt(i)));
        }
        
        
        //stack이 비워질 때까지 pop()을 해주면서 1의 갯수를 새고 1을 2진수로 변환후 stack에 다시 추가해 1이 남을 때까지 반복
        while(stack.size()>1){
            while(!stack.isEmpty()){
                if(stack.pop().equals("1")){
                    countOne+=1;
                }
                else{
                    countZero+=1;
                }
            }
            for(int i=0;i<two(countOne).length();i++){
                stack.push(String.valueOf(two(countOne).charAt(i)));
            }
            countOne=0;
            count+=1;
            //System.out.println(stack);
        }
        //System.out.println(count);
        //System.out.println(countZero);
        
        answer[0]=count;
        answer[1]=countZero;
        return answer;
    }
}