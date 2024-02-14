import java.util.*;
/*
접근법
1. dq에 대소문자 상관없이 cities[i]가 들어있다면 check를 true로 함 아님 false
2. dq에 cacheSize만큼 cities[i]를  삽입
3. dq가 cacheSize보다 클 경우 check가 false이면 dq의 맨 앞 제거, check가 true이면 dq에 제일 앞에 들어있는 해당 원소를 제거(최신화)
4. check가 false 이면 +5 , check가 true 이면 +1 
*/
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque<String> dq=new ArrayDeque<>();
        
        for(int i=0;i<cities.length;i++){
            Boolean check=false;
            for(String str:dq){
                if(str.equalsIgnoreCase(cities[i])){
                    check=true;
                }
            }
            //System.out.println(check);
            if(cacheSize!=0){
                dq.add(cities[i].toUpperCase());
                if(dq.size()>cacheSize){
                    if(check==false){
                      dq.removeFirst();  
                    }
                    //캐시 최신화
                    else{
                        dq.removeFirstOccurrence(cities[i].toUpperCase());
                    }
                }
            }
            //System.out.println(dq);
            
            if(check){
                answer+=1;
            }
            else{
                answer+=5;
            }
        }
        
        return answer;
    }
}