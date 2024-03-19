class Solution {    
    public int solution(int n, int k) {
        int answer = -1;
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            sb.append(String.valueOf(n%k));
            n/=k;
            if(n==0){
                break;
            }
        }
        sb.reverse();
        String s=sb.toString();
        String[] strArr;
        strArr=s.split("0");
        for(String str:strArr){
            if(!str.equals("")){
                Long a=Long.parseLong(str);
                if(num(a)){
                    answer++;
                }
            }
            
        }
        return answer+1;
    }
    public Boolean num(Long a){
        if(a==1){
            return false;
        }
        else{
            for(int i=2;i<=Math.sqrt((double)a);i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}