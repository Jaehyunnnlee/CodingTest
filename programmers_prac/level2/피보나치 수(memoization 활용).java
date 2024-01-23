class Solution {
    static int[] num;
    public int solution(int n) {
        int answer = 0;
        num=new int[n+1];
        answer=fivo(n);
        return answer;
    }
    
    //memoization
    public int fivo(int n){
        if(n==1||n==2){
            num[n]=1;
        }
        if(n<2||num[n]!=0){
            return num[n]%1234567;
        }
        else{
            return num[n]=(fivo(n-1)+fivo(n-2))%1234567;
        }
    }
}