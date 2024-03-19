class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] maxArr=new int[land.length+1][4];
        
        for(int i=1;i<land.length+1;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(j==k){
                        continue;
                    }
                    maxArr[i][j]=Integer.max(maxArr[i-1][k]+land[i-1][j],maxArr[i][j]);
                }
                System.out.print(maxArr[i][j]+" ");
            }
            System.out.println();
        }
        return answer;
    }
}