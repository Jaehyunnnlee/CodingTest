import java.util.*;

class Solution {
    public int[] solution(String s) {
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        String[] arr;
        sb.append(s);
        sb.delete(0,1);
        sb.delete(sb.length()-2,sb.length()-1);
        
        while(sb.indexOf("}")!=-1){
            list.add(sb.substring(sb.indexOf("{")+1,sb.indexOf("}")));
            sb.delete(sb.indexOf("{"),sb.indexOf("}")+1);
        }
        for(String str:list){
            arr=str.split(",");
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],0);    
            }
        }
        for(String str:list){
            arr=str.split(",");
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.get(arr[i])+1);    
            }
        }
        //System.out.println(map);
        int[] answer = new int[map.size()];
        int index=0;
        String maxKey=" ";
        while(!map.isEmpty()){
            int max=-1;
            for(String key:map.keySet()){
                if(map.get(key)>max){
                    max=Integer.max(map.get(key),max);
                    maxKey=key;
                }
            }
            //System.out.println(maxKey);
            map.remove(maxKey);
            answer[index]=Integer.parseInt(maxKey);
            index++;
        }
        return answer;
    }
}