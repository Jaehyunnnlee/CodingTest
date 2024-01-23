class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb=new StringBuilder();
        int countOrigin=0,countNext=0;
        sb.append(Integer.toBinaryString(n));
        //System.out.println(sb);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                countOrigin++;
            }
        }
        //System.out.println(countOrigin);
        
        //n+1씩 하면서 2진수중 1의 갯수가 같을때까지 반복
        while(countNext!=countOrigin){
            //sb 초기화
            sb.delete(0,sb.length());
            countNext=0;
            n++;
            sb.append(Integer.toBinaryString(n));
            //System.out.println(n);
            //System.out.println(sb);
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='1'){
                    countNext++;
                }
            }
            //1의 개수가 같으면 answer에 n 저장
            if(countNext==countOrigin){
                answer=n;
            }
        }
        return answer;
    }
}