class Solution {
    static int result=0;
    public int solution(int[] numbers, int target) {
        int answer = 0,index=0,sum=0;
        dfs(index,numbers,target,sum);
        answer=result;
        return answer;
    }
    public void dfs(int index,int[] numbers, int target, int sum){
        if(index==numbers.length){
            if(sum==target){
                result+=1;
            }
            return;
        }
        dfs(index+1,numbers,target,sum+numbers[index]);
        dfs(index+1,numbers,target,sum-numbers[index]);
    }
}