import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<skill.length();i++){
            map.put(skill.charAt(i),i+1);
        }
        for(String str:skill_trees){
            for(int i=0;i<str.length();i++){
                if(map.containsKey(str.charAt(i))){
                    sb.append(String.valueOf(str.charAt(i)));
                }
            }
            //기존 순서를 저장할 str2
            String str2="";
            for(int i=0;i<sb.length();i++){
                list.add(map.get(sb.charAt(i)));
                str2=str2.concat(String.valueOf(map.get(sb.charAt(i))));
            }
            
            //list정렬
            Collections.sort(list);
            //정렬된 순서를 저장할 str3
            String str3="";
            if(!list.isEmpty()){
                for(int i=0;i<list.size();i++){
                    if(i<list.size()-1){
                        if(list.get(i)+1!=list.get(i+1)){
                            break;
                        }
                    }
                    str3=str3.concat(String.valueOf(list.get(i)));
                }
            }
            
            if(!list.isEmpty()&&list.get(0)>1){
                str3="";
            }
            
            
            //기존 순서와 정렬된 순서가 같다면 정답
            if(str2.equals(str3)){
                System.out.println(str2+" "+str3);
                answer++;
            }
            sb.delete(0,sb.length());
            list.clear();
        }
        
        return answer;
    }
}