import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] map=new String[park.length][park[0].length()];
        String[] routeArr=new String[2];
        int startX=0,startY=0;
        int[] startPos=new int[2];
        int posX=0, posY=0,oriPosX=0,oriPosY=0,afterPosX=0,afterPosY=0;
        List<int[]> availableRoute=new ArrayList<>();
        List<int[]> disableRoute=new ArrayList<>();
        
        //시작위치 지정
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[0].length();j++){
                map[i][j]=String.valueOf(park[i].charAt(j));
                if(map[i][j].equals("S")){
                    startPos[1]=i;
                    startPos[0]=j;
                }
                if(map[i][j].equals("X")){
                    int[] pos={j,i};
                    disableRoute.add(pos);
                }
                if(map[i][j].equals("O")){
                    int[] pos={j,i};
                    availableRoute.add(pos);
                }
            }
        }
        posX=startPos[0];
        posY=startPos[1];
        for(String str:routes){
            int count=0;
            routeArr=str.split(" ");
            if(routeArr[0].equals("E")){
                afterPosX=posX+Integer.parseInt(routeArr[1]);
                if(afterPosX>-1&&afterPosX<park[0].length()){
                    for(int[] arr:disableRoute){
                        if(posX<arr[0]&&afterPosX>=arr[0]&&posY==arr[1]){
                            count++;
                        }
                    }
                }
                else{
                    count++;
                }
                if(count==0){
                        posX=afterPosX;
                }
                else{
                    afterPosX=posX;
                }
                
            }
            else if(routeArr[0].equals("W")){
                afterPosX=posX-Integer.parseInt(routeArr[1]);
                if(afterPosX>-1&afterPosX<park[0].length()){
                    for(int[] arr:disableRoute){
                        if(posX>arr[0]&&afterPosX<=arr[0]&&posY==arr[1]){
                            count++;
                        }
                    }
                }
                else{
                    count++;
                }
                if(count==0){
                    posX=afterPosX;
                }
                else{
                    afterPosX=posX;
                }
            }
            else if(routeArr[0].equals("N")){
                afterPosY=posY-Integer.parseInt(routeArr[1]);
                if(afterPosY>-1&&afterPosY<park.length){
                    for(int[] arr:disableRoute){
                        if(afterPosY<=arr[1]&&posY>arr[1]&&posX==arr[0]){
                            count++;
                        }
                    }
                }
                else{
                    count++;
                }
                if(count==0){
                        posY=afterPosY;
                }
                else{
                    afterPosY=posY;
                }
            }
            else if(routeArr[0].equals("S")){
                afterPosY=posY+Integer.parseInt(routeArr[1]);
                if(afterPosY>-1&&afterPosY<park.length){
                    for(int[] arr:disableRoute){
                        if(posY<arr[1]&&afterPosY>=arr[1]&&posX==arr[0]){
                            count++;
                        }
                    }
                }
                else{
                    count++;
                }
                
                if(count==0){
                    posY=afterPosY;
                }
                else{
                    afterPosY=posY;
                }
            }
            
        }
        
        
        for(int[] arr:disableRoute){
            int[] pos=arr;
            //System.out.println(pos[0]+" "+pos[1]);
        }
        
        answer[0]=posY;
        answer[1]=posX;
        
        return answer;
    }
}