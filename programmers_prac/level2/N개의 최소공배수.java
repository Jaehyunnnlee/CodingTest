import java.util.*;

class Solution {
    //a*b=gcd(최대공약수)*lcm(최소공배수)
    private int lcm(int a,int b){
        int lcm=a*b/gcd(a,b);
        return lcm;
    }
    
    //최대 공약수 구하는 공식 참고
    private int gcd(int a,int b){
        int big=0,small=0,remain=0;
        if(a>b){
            big=a;
            small=b;
        }
        else{
            big=b;
            small=a;
        }
        
        remain=big%small;
        
        if(remain==0){
            return small;
        }
        
        return gcd(small,remain);
    }
    
    public int solution(int[] arr) {
        int answer = 1,small=0,big=0,lcm=0;
        Stack<Integer> stack=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            stack.add(arr[i]);    
        }
        big=stack.pop();
        small=stack.pop();
        lcm=lcm(big,small);
         while(!stack.isEmpty()){
             lcm=lcm(lcm,stack.pop());
         }
        
        answer=lcm;
        return answer;
    } 
}
