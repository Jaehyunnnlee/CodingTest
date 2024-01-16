import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        for(int i=0;i<survey.length;i++){
            if(choices[i]==1){
                map.put(survey[i].charAt(0),map.get(survey[i].charAt(0))+3);
                continue;
            }
            if(choices[i]==2){
                map.put(survey[i].charAt(0),map.get(survey[i].charAt(0))+2);
                continue;
            }
            if(choices[i]==3){
                map.put(survey[i].charAt(0),map.get(survey[i].charAt(0))+1);
                continue;
            }
            if(choices[i]==4){
                continue;
            }
            if(choices[i]==5){
                map.put(survey[i].charAt(1),map.get(survey[i].charAt(1))+1);
                continue;
            }
            if(choices[i]==6){
                map.put(survey[i].charAt(1),map.get(survey[i].charAt(1))+2);
                continue;
            }
            if(choices[i]==7){
                map.put(survey[i].charAt(1),map.get(survey[i].charAt(1))+3);
                continue;
            }
        }
        
        System.out.println(map);
        if(map.get('R')>=map.get('T')){
            sb.append("R");
        }
        else{
            sb.append("T");
        }
        if(map.get('C')>=map.get('F')){
            sb.append("C");
        }
        else{
            sb.append("F");
        }
        if(map.get('J')>=map.get('M')){
            sb.append("J");
        }
        else{
            sb.append("M");
        }
        if(map.get('A')>=map.get('N')){
            sb.append("A");
        }
        else{
            sb.append("N");
        }
        System.out.println(sb);
        answer=sb.toString();
        return answer;
    }
}