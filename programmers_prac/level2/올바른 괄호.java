import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        StringBuilder sb=new StringBuilder();
        int count=0;
        
        sb.append(s);
        
        for(int i=0;i<sb.length();i++){
            //( 이면 count+1
            if(sb.charAt(i)=='('){
                count+=1;
            }
            //시작이 ( 이 아니면 return false
            else if(count==0){
                return false;
            }
            //) 이면 count-1
            else{
                count-=1;
            }
        }
        //괄호의 ( 와 ) 개수가 맞지 않으면 return false 
        if(count!=0){
            return false;
        }
        
        return answer;
    }
}