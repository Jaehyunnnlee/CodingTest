import java.util.*;

class Solution {
    public String[] solution(String[] record) {
       
        String[] names;
        List<String> answerList=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        
        for(String str:record){
            names=str.split(" ");
            if(!names[0].equals("Leave")){
                map.put(names[1],names[2]);
            }
        }
        for(String str:record){
            names=str.split(" ");
            if(names[0].equals("Enter")){
                answerList.add(map.get(names[1])+"님이 들어왔습니다.");
            }
            else if(names[0].equals("Leave")){
                answerList.add(map.get(names[1])+"님이 나갔습니다.");
            }
        }
        String[] answer = new String[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i]=answerList.get(i);
        }
        // System.out.println(answerList);
        return answer;
    }
}