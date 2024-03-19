class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int count=0;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        //진수 변환
        for(int i=0;i<=t*m;i++){
            int x=i;
            if(x==0){
                sb.append("0");
            }
            else{
                while(x!=0){
                    if(x%n==10){
                    sb.append("A");
                    }
                    else if(x%n==11){
                        sb.append("B");
                    }
                    else if(x%n==12){
                        sb.append("C");
                    }
                    else if(x%n==13){
                        sb.append("D");
                    }
                    else if(x%n==14){
                        sb.append("E");
                    }
                    else if(x%n==15){
                        sb.append("F");
                    }
                    else{
                      sb.append(x%n);  
                    }
                    x/=n;
                }
            }
            sb2.append(sb.reverse());
            sb.delete(0,sb.length());
        }
        //System.out.println(sb2);
        while(true){
            for(int i=0;i<sb2.length();i++){
                if(i%m==p-1){
                    sb3.append(String.valueOf(sb2.charAt(i)));
                    count++;
                }
                if(count==t){
                    break;
                }
            }
            if(count==t){
                break;
            }
        }
        // System.out.println(sb2);
        // System.out.println(sb3);
        answer=sb3.toString();
        return answer;
    }
}