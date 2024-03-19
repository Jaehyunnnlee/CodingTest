import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] chs=new char[m][n];
        boolean[][] equal=new boolean[m][n];
        char tmp=' ';
        int count=2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                chs[i][j]=board[i].charAt(j);
            }
        }
        while(count>0){
            count=0;
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n;j++){
                    while(chs[i][j]!='.'&&chs[i+1][j]=='.'){
                        tmp=chs[i+1][j];
                        chs[i+1][j]=chs[i][j];
                        chs[i][j]=tmp;
                        i=0;
                    }
                }
            }
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n-1;j++){
                    if(chs[i+1][j+1]==chs[i][j]&&chs[i][j+1]==chs[i][j]&&chs[i+1][j]==chs[i][j]&&chs[i][j]!='.'){
                        equal[i][j]=true;
                        equal[i+1][j+1]=true;
                        equal[i+1][j]=true;
                        equal[i][j+1]=true;
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(equal[i][j]==true){
                        chs[i][j]='.';
                        count++;
                    }
                }
            }
            
            for(boolean[] bool:equal){
                Arrays.fill(bool,false);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(chs[i][j]=='.'){
                    answer++;
                }
            }
        }
        return answer;
    }
}