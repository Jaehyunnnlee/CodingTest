import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0,n=0;
        List<String> str1List=new ArrayList<>();
        List<String> str2List=new ArrayList<>();
        List<String> retainList=new ArrayList<>();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        sb1.append(str1.toLowerCase());
        sb2.append(str2.toLowerCase());
        for(int i=0;i<sb1.length()-1;i++){
            String str=sb1.substring(i,i+2);
            n=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)>='a'&&str.charAt(j)<='z'){
                    n++;
                }
            }
            if(n==2){
                str1List.add(str);
            }
        }
        for(int i=0;i<sb2.length()-1;i++){
            String str=sb2.substring(i,i+2);
            n=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)>='a'&&str.charAt(j)<='z'){
                    n++;
                }
            }
            if(n==2){
                str2List.add(str);
            }
        }
        
         // System.out.println(str1List);
         // System.out.println(str2List);
        List<String> oriStr2List=new ArrayList<>(str2List);
        for(int i=0;i<str1List.size();i++){
            if(str2List.contains(str1List.get(i))){
                retainList.add(str1List.get(i));
                str2List.remove(str1List.get(i));
            }
        }
        str1List.addAll(oriStr2List);
        List<String> addAllList=new ArrayList<>(str1List);
        for(String str:retainList){
            addAllList.remove(str);
        }
         // System.out.println(retainList);
         // System.out.println(addAllList);
        if(addAllList.size()==0){
            answer=65536;
        }
        else if(retainList.size()==0){
            answer=0;
        }
        else{
            answer=(int)((double)retainList.size()/(double)addAllList.size()*65536);
        }
        
        return answer;
    }
}