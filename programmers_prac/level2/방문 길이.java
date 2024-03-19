import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[][] map=new int[10][10];
        int[] x={-1,0,1};
        int[] y={-1,0,1};
        int dx=5,dy=5;
        int currentX=0,currentY=0;
        Map<String,Integer> route=new HashMap<>();
        for(int i=0;i<dirs.length();i++){
            if(dirs.charAt(i)=='U'){
                currentX=dx;
                currentY=dy;
                dx+=x[1];
                dy+=y[2];
                if(dx>=0&&dx<=map.length&&dy>=0&&dy<=map[0].length){
                    String str="";
                    str=str.concat(String.valueOf(currentX));
                    str=str.concat(String.valueOf(currentY));
                    str=str.concat(String.valueOf(dx));
                    str=str.concat(String.valueOf(dy));
                    String reverseStr="";
                    reverseStr=reverseStr.concat(String.valueOf(dx));
                    reverseStr=reverseStr.concat(String.valueOf(dy));
                    reverseStr=reverseStr.concat(String.valueOf(currentX));
                    reverseStr=reverseStr.concat(String.valueOf(currentY));
                    if(!route.containsKey(str)){
                        route.put(str,1);
                    }
                    if(!route.containsKey(reverseStr)){
                        route.put(reverseStr,1);
                    }
                }
                else{
                    dx=currentX;
                    dy=currentY;
                    continue;
                }
            }
            if(dirs.charAt(i)=='D'){
                currentX=dx;
                currentY=dy;
                dx+=x[1];
                dy+=y[0];
                if(dx>=0&&dx<=map.length&&dy>=0&&dy<=map[0].length){
                    String str="";
                    str=str.concat(String.valueOf(currentX));
                    str=str.concat(String.valueOf(currentY));
                    str=str.concat(String.valueOf(dx));
                    str=str.concat(String.valueOf(dy));
                    String reverseStr="";
                    reverseStr=reverseStr.concat(String.valueOf(dx));
                    reverseStr=reverseStr.concat(String.valueOf(dy));
                    reverseStr=reverseStr.concat(String.valueOf(currentX));
                    reverseStr=reverseStr.concat(String.valueOf(currentY));
                    if(!route.containsKey(str)){
                        route.put(str,1);
                    }
                    if(!route.containsKey(reverseStr)){
                        route.put(reverseStr,1);
                    }
                }
                else{
                    dx=currentX;
                    dy=currentY;
                    continue;
                }
            }
            if(dirs.charAt(i)=='L'){
                currentX=dx;
                currentY=dy;
                dx+=x[0];
                dy+=y[1];
                if(dx>=0&&dx<=map.length&&dy>=0&&dy<=map[0].length){
                   String str="";
                    str=str.concat(String.valueOf(currentX));
                    str=str.concat(String.valueOf(currentY));
                    str=str.concat(String.valueOf(dx));
                    str=str.concat(String.valueOf(dy));
                    String reverseStr="";
                    reverseStr=reverseStr.concat(String.valueOf(dx));
                    reverseStr=reverseStr.concat(String.valueOf(dy));
                    reverseStr=reverseStr.concat(String.valueOf(currentX));
                    reverseStr=reverseStr.concat(String.valueOf(currentY));
                    if(!route.containsKey(str)){
                        route.put(str,1);
                    }
                    if(!route.containsKey(reverseStr)){
                        route.put(reverseStr,1);
                    }
                }
                else{
                    dx=currentX;
                    dy=currentY;
                    continue;
                }
            }
            if(dirs.charAt(i)=='R'){
                currentX=dx;
                currentY=dy;
                dx+=x[2];
                dy+=y[1];
                if(dx>=0&&dx<=map.length&&dy>=0&&dy<=map[0].length){
                    String str="";
                    str=str.concat(String.valueOf(currentX));
                    str=str.concat(String.valueOf(currentY));
                    str=str.concat(String.valueOf(dx));
                    str=str.concat(String.valueOf(dy));
                    String reverseStr="";
                    reverseStr=reverseStr.concat(String.valueOf(dx));
                    reverseStr=reverseStr.concat(String.valueOf(dy));
                    reverseStr=reverseStr.concat(String.valueOf(currentX));
                    reverseStr=reverseStr.concat(String.valueOf(currentY));
                    if(!route.containsKey(str)){
                        route.put(str,1);
                    }
                    if(!route.containsKey(reverseStr)){
                        route.put(reverseStr,1);
                    }
                }
                else{
                    dx=currentX;
                    dy=currentY;
                    continue;
                }
            }
        // System.out.println(currentX+","+currentY);
        // System.out.println(dx+","+dy);
        // System.out.println(route);
        // System.out.println("---------");
        }
        answer=route.size()/2;
        return answer;
    }
}