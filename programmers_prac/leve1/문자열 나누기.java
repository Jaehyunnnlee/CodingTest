import java.util.*;
class Solution {
    private static int count=1;
    private String remove(String s){
        Deque<String> sdq=new ArrayDeque();
        String remove="";
        int countEqual=0,countDiff=0;
        for(int i=0;i<s.length();i++){
            sdq.add(String.valueOf(s.charAt(i)));
        }
        
        Iterator<String> ir=sdq.iterator();
        while(ir.hasNext()){
            String str=ir.next();
            if(sdq.getFirst().equals(str)){
                countEqual+=1;
            }
            else{
                countDiff+=1;
            }
            if(countEqual==countDiff){
                for(int i=0;i<countEqual*2;i++){
                    remove=remove.concat(sdq.removeFirst());
                }
                //System.out.println("remove:"+remove);
                count++;
                remove(remain(s,remove));
                break;
            }
        }
        return remove; 
    }
    
    private String remain(String original,String remove){
        String remain="";
        remain=original.replaceFirst(remove,"");
        if(remain.length()<1){
            count--;
            //System.out.println("remain:"+remain);
            return "";
        }
        
        //System.out.println("remain:"+remain);
        return remain;
    }
    
    public int solution(String s) {
        int answer = 0;
        remove(s);
        answer=count;
        return answer;
    }
}