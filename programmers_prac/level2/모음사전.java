import java.util.*;
class Solution {
    public int solution(String word) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> dic=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        int answer = 0,num=0;
        List<String> charList=new ArrayList<>();
        charList.add("A");
        charList.add("E");
        charList.add("I");
        charList.add("O");
        charList.add("U");
            
        for(String str:charList){
            sb.append(str);
            if(sb.length()==1){
                if(list.contains(word)){
                    break;
                }
                list.add(sb.toString());
            }
            for(String str2:charList){
                sb.append(str2);
                if(sb.length()==2){
                    if(list.contains(word)){
                        break;
                    }
                    list.add(sb.toString());
                }
                for(String str3:charList){
                    sb.append(str3);
                    if(sb.length()==3){
                        if(list.contains(word)){
                            break;
                        }
                        list.add(sb.toString());
                    }
                    for(String str4:charList){
                        sb.append(str4);
                        if(sb.length()==4){
                            if(list.contains(word)){
                                break;
                            }
                            list.add(sb.toString());
                        }
                        for(String str5:charList){
                            sb.append(str5);
                            if(sb.length()==5){
                                if(list.contains(word)){
                                    break;
                                }
                                list.add(sb.toString());
                            }
                            sb.deleteCharAt(4);
                        }
                        sb.deleteCharAt(3);
                    }
                    sb.deleteCharAt(2);
                }
                sb.deleteCharAt(1);
            }
            sb.deleteCharAt(0);
        }

        // System.out.println(list);
        answer=list.indexOf(word)+1;
        return answer;
    }
}