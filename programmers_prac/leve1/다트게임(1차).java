import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String replaceStr=dartResult.replace("10","X");
        StringBuilder sb=new StringBuilder(replaceStr);
        StringBuilder first=new StringBuilder();
        StringBuilder second=new StringBuilder();
        StringBuilder third=new StringBuilder();
        int firstScore=0,secondScore=0,thirdScore=0;
        
        if(sb.charAt(2)!='#'&&sb.charAt(2)!='*'){
            sb.insert(2," ");
        }
        if(sb.charAt(5)!='#'&&sb.charAt(5)!='*'){
            sb.insert(5," ");
        }
        if(sb.charAt(sb.length()-1)!='#'&&sb.charAt(sb.length()-1)!='*'){
            sb.insert(sb.length()," ");
        }
        first.append(sb.substring(0,3));
        second.append(sb.substring(3,6));
        third.append(sb.substring(6,9));
        if(first.charAt(0)=='X'){
            firstScore=10;
        }
        else{
            firstScore=Integer.parseInt(String.valueOf(first.charAt(0)));
        }
        
        if(first.charAt(1)=='D'){
            firstScore*=firstScore;
        }
        else if(first.charAt(1)=='T'){
            firstScore*=firstScore*firstScore;
        }
        
        if(first.charAt(2)=='#'){
            firstScore*=-1;
        }
        else if(first.charAt(2)=='*'){
            firstScore*=2;
        }
        if(second.charAt(0)=='X'){
            secondScore=10;
        }
        else{
            secondScore=Integer.parseInt(String.valueOf(second.charAt(0)));
        }
        
        if(second.charAt(1)=='D'){
            secondScore*=secondScore;
        }
        else if(second.charAt(1)=='T'){
            secondScore*=secondScore*secondScore;
        }
        
        if(second.charAt(2)=='#'){
            secondScore*=-1;
        }
        else if(second.charAt(2)=='*'){
            firstScore*=2;
            secondScore*=2;
        }
        if(third.charAt(0)=='X'){
            thirdScore=10;
        }
        else{
            thirdScore=Integer.parseInt(String.valueOf(third.charAt(0)));
        }
        
        if(third.charAt(1)=='D'){
            thirdScore*=thirdScore;
        }
        else if(third.charAt(1)=='T'){
            thirdScore*=thirdScore*thirdScore;
        }
        
        
        if(third.charAt(2)=='#'){
            thirdScore*=-1;
        }
        else if(third.charAt(2)=='*'){
            secondScore*=2;
            thirdScore*=2;
        }
        System.out.println(firstScore);
        System.out.println(secondScore);
        System.out.println(thirdScore);
        
        
        answer=firstScore+secondScore+thirdScore;
        return answer;
    }
}