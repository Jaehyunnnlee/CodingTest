import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer=0,count=0;
        boolean visited[]=new boolean[dungeons.length];
        List<Integer> answerList=new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        DFS(k,count,visited,dungeons,answerList);
        //System.out.println(answerList);
        for(Integer i:answerList){
            answer=Integer.max(answer,i);
        }
        return answer;
    }
    
    public void DFS(int k,int count,boolean[] visited,int [][] dungeons,List<Integer> answerList){
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i]&&k>=dungeons[i][0]){
                visited[i]=true;
                answerList.add(count+1);
                DFS(k-dungeons[i][1],count+1,visited,dungeons,answerList);
                visited[i]=false;
            }
            
        }
    }
}