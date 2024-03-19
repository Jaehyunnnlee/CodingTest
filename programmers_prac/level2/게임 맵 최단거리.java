import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> q=new LinkedList<>();
        int[][] visited=new int[maps.length][maps[0].length];
        int[] x={-1,0,1,0};
        int[] y={0,-1,0,1};
        int answer = 0;
        int[] start={0,0};
        q.add(start);
        visited[0][0]=1;
        while(!q.isEmpty()){
            int[] current=q.remove();
            int currentX=current[0];
            int currentY=current[1];
            for(int i=0;i<4;i++){
                int dx=currentX+x[i];
                int dy=currentY+y[i];
                if(dx>=0&&dx<maps.length&&dy>=0&&dy<maps[0].length){
                    if(visited[dx][dy]==0&&maps[dx][dy]==1){
                        int[] v={dx,dy};
                        q.add(v);
                        visited[dx][dy]=visited[currentX][currentY]+1;
                    }
                }
            }
        }
        // for(int j=0;j<maps.length;j++){
        //     for(int k=0;k<maps[0].length;k++){
        //         System.out.print(visited[j][k]+"     ");
        //     }
        //     System.out.println();
        // }
        
        
        answer=visited[maps.length-1][maps[0].length-1];
        if(answer==0){
            return -1;
        } 
        return answer;
    }
}