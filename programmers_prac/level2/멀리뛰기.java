class Solution {
//     n=1 1가지
//     n=2 2가지
//     n=3 3가지  n1+n2
//     n=4 5가지  n2+n3
//     n=5 8가지  n3+n4
//     n=6 13가지 n4+n5
//     ...(규칙을 보고 피보나치 적용)
    static int[] memo;
    private int fivo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n<3||memo[n]!=0){
            return memo[n]%1234567;
        }
        else{
            return memo[n]=(fivo(n-1)+fivo(n-2))%1234567;
        }
        
    }
    public long solution(int n) {
        long answer=0;
        memo=new int[n+1];
        answer=fivo(n);
        return answer;
    }
}