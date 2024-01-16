class Solution {
    public int[] solution(String[] wallpaper) {
        
        int n=wallpaper.length;
        int m=wallpaper[0].length();
        int lux=100,luy=100,rdx=-1,rdy=-1;
        char[][] desktop=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                desktop[i][j]=wallpaper[i].charAt(j);
                //System.out.print(desktop[i][j]+" ");
                if(desktop[i][j]=='#'){
                    if(i<=lux){
                        lux=i;
                    }
                    if(j<=luy){
                        luy=j;
                    }
                    if(i>=rdx){
                        rdx=i+1;
                    }
                    if(j>=rdy){
                        rdy=j+1;
                    }
                }
            }
            //System.out.println();
        }
        //System.out.print(lux+","+luy+","+rdx+","+rdy);
        int[] answer = {lux,luy,rdx,rdy};
        
        return answer;
    }
}