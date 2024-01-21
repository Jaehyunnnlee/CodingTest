class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr=new int[n];
        int start=1, end=1, sum=0;
        
        while(true){
            //sum이 크거나 같으면 sum에서 start를 빼주고 start+1을 함
            if(sum>=n){
                sum-=start++;
            }
            //end가 자연수n과 같아지면 answer+1을 하고 반복문 종료
            else if(end==n){
                answer++;
                break;
            }
            //sum이 n보다 작으면 end를 더해주고 end+1을 함
            else {
                sum+=end++;
            }
            
            //sum이 같으면 answer+1을 함
            if(sum==n){
                answer++;
            }
            //System.out.println(sum);
        }
        //System.out.println(answer);
        return answer;
    }
}