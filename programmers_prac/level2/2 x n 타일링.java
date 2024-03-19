import java.util.*;
class Solution {
    public static int[] dp=new int[60001];
    public int solution(int n) {
        int answer = 0;
        answer=fivo(n);
        return answer;
    }
    public int fivo(int n){
        if(n==1){
            dp[n]=1;
            return dp[n]%1000000007;
        }
        else if(n==2){
            dp[n]=2;
            return dp[n]%1000000007;
        }
        else if(dp[n]!=0){
            return dp[n]%1000000007;
        }
        else{
            dp[n]=fivo(n-1)+fivo(n-2);
            return dp[n]%1000000007;
        }
    }
}