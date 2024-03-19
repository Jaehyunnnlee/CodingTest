import java.util.;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        int[] dp=new int[y+1];
        Arrays.fill(dp,-1);
        dp[x]=0;
        for(int i=x;i=y;i++){
            if(dp[i]!=-1){
                if(i+n=y){
                    if(dp[i+n]==-1){
                        dp[i+n]=dp[i]+1;
                    }else if(dp[i+n]!=-1){
                        dp[i+n]=Integer.min(dp[i]+1,dp[i+n]);
                    }
                }
                if(i2=y){
                    if(dp[i2]==-1){
                        dp[i2]=dp[i]+1;
                    }else if(dp[i2]!=-1){
                        dp[i2]=Integer.min(dp[i]+1,dp[i2]);
                    }
                }
                if(i3=y){
                    if(dp[i3]==-1){
                        dp[i3]=dp[i]+1;
                    }else if(dp[i3]!=-1){
                        dp[i3]=Integer.min(dp[i]+1,dp[i3]);
                    }
                }
            }
        }
         for(int i=0;idp.length;i++){
             System.out.print(dp[i]+ );
         }
        return dp[y];
    }
}