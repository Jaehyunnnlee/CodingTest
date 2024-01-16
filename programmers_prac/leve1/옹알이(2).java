import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0,count=0;
        ArrayList<String> babbles=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        babbles.add("aya");
        babbles.add("ye");
        babbles.add("woo");
        babbles.add("ma");
        
        for(int i=0;i<babbling.length;i++){
            for(String babble:babbles){
                int index=babbles.indexOf(babble)+1;
                babbling[i]=babbling[i].replace(babble,String.valueOf(index));
            }
            
            try{
                babbling[i]=String.valueOf((Integer.parseInt(babbling[i])));
                for(int j=0;j<babbling.length;j++){
                    if(j<babbling[i].length()-1&&babbling[i].charAt(j)==babbling[i].charAt(j+1)){   
                        count=1;
                        if(count==1){
                             babbling[i]=babbling[i].replace(babbling[i],"");
                        }
                    }
                }
                if(babbling[i]!=""){
                answer+=1;
            }
            System.out.print(babbling[i]+" ");
            }
            catch(NumberFormatException n){
                
            }
        }
        return answer;
    }
}
