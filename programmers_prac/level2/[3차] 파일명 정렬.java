import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files,new FileComparator());
        return files;
    }
    
    public class FileComparator implements Comparator<String>{
        public int compare(String o1,String o2){
            String[] part1=splitPart(o1);
            String[] part2=splitPart(o2);
            
            int headComparing=part1[0].compareToIgnoreCase(part2[0]);
            int numberComparing=Integer.parseInt(part1[1])-Integer.parseInt(part2[1]);
            
            if(headComparing==0){
                if(numberComparing==0){
                    return 0;
                }
                return numberComparing;
            }
            return headComparing;
        }
    }
    
    public String[] splitPart(String s){
        String[] splitFile=new String[3];
        boolean state=false;
        int numberStartIdx=-1;
        
        for(int i=0;i<s.length();i++){
            if(!state&&isNumber(s.charAt(i))){
                splitFile[0]=s.substring(0,i);
                numberStartIdx=i;
                state=true;
                if(i==s.length()-1){
                    splitFile[1]=s.substring(numberStartIdx);
                }
            } else if(state&&!isNumber(s.charAt(i))){
                String number=s.substring(numberStartIdx,i);
                if(number.length()>5){
                    i=i-(number.length()-5);
                }
                splitFile[1]=s.substring(numberStartIdx,i);
                splitFile[2]=s.substring(i);
                break;
            }
        }
        if(splitFile[1]==null){
            int i=s.length();
            String number=s.substring(numberStartIdx,i);
            if(number.length()>5){
                i=i-(number.length()-5);
            }
            splitFile[1]=s.substring(numberStartIdx,i);
            splitFile[2]=s.substring(i);
        }
        return splitFile;
    }
    
    public boolean isNumber(char c){
        if(c>='0'&&c<='9'){
            return true;
        }
        return false;
    }
}