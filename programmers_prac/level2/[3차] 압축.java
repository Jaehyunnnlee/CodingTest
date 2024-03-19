import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        List<Integer> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder(msg);
        String str=null;
        Map<String,Integer> map=new HashMap<>();
        int num=26,max=0;
        char a='A';
        char z='Z';
        for(int i=(int)a;i<=(int)z;i++){
            map.put(String.valueOf((char)i),i-64);
        }
        while(sb.length()!=0){
            max=0;
            for(int i=0;i<=sb.length();i++){
                str=sb.substring(0,i);
                if(map.containsKey(str)){
                    max=Integer.max(max,str.length());
                }
            }
            try{
                str=sb.substring(0,max+1);
            }catch(Exception e){
                
            }
            list.add(map.get(sb.substring(0,max)));
            sb.delete(0,max);

            if(map.containsKey(str)){
                continue;
            }
            num++;
            map.put(str,num);
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}