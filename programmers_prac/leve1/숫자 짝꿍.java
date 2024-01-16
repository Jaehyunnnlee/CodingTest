import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer="";
        HashSet<String> setX=new HashSet<>();
        HashSet<String> setY=new HashSet<>();
        HashMap<String,Integer> mapX=new HashMap<>();
        HashMap<String,Integer> mapY=new HashMap<>();
        List<String> answerList=new ArrayList<>();
        StringBuilder sbAnswer=new StringBuilder();
        StringBuilder sbX=new StringBuilder();
        StringBuilder sbY=new StringBuilder();
        sbX.append(X);
        sbY.append(Y);
        
        for(int i=0;i<X.length();i++){
            setX.add(String.valueOf(X.charAt(i)));
        }
        for(int i=0;i<Y.length();i++){
            setY.add(String.valueOf(Y.charAt(i)));
        }
        setX.retainAll(setY);
        
        for(String str:setX){
            mapX.put(str,0);
            mapY.put(str,0);
        }
        
        //System.out.println(mapX);
        //System.out.println(mapY);
        if(setX.isEmpty()){
            answer="-1";
        }
        
        else if(setX.size()==1&&setX.contains("0")){
            answer="0";
        }
        
        else{
            for(int i=0;i<sbX.length();i++){
                if(setX.contains(String.valueOf(sbX.charAt(i)))){
                    mapX.replace(String.valueOf(sbX.charAt(i)),mapX.get(String.valueOf(sbX.charAt(i)))+1);
                }
            }
            for(int i=0;i<sbY.length();i++){
                if(setX.contains(String.valueOf(sbY.charAt(i)))){
                    mapY.replace(String.valueOf(sbY.charAt(i)),mapY.get(String.valueOf(sbY.charAt(i)))+1);
                }
            }
            //System.out.println(mapX);
            //System.out.println(mapY);
            for(String str:setX){
                if(mapX.get(str)>=mapY.get(str)){
                    for(int i=0;i<mapY.get(str);i++){
                        answerList.add(str);
                    }
                }
                else{
                    for(int i=0;i<mapX.get(str);i++){
                        answerList.add(str);
                    }
                }
            }
            Collections.sort(answerList,Collections.reverseOrder());
            //System.out.println(answerList);
            for(String str:answerList){
                sbAnswer.append(str);
            }
            answer=sbAnswer.toString();
        }
        //System.out.println(sbAnswer);
        
        return answer;
    }
}