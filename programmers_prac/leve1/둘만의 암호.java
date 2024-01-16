import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int count=0;
        String alphabet="";
        List<Character> abc=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<26;i++){
            alphabet=alphabet.concat(String.valueOf((char)(i+97)));
        }
        //System.out.println(alphabet);
        for(int i=0;i<alphabet.length();i++){
            abc.add(alphabet.charAt(i));
        }
        for(int i=0;i<skip.length();i++){
            if(abc.contains(skip.charAt(i))){
                abc.remove(abc.indexOf(skip.charAt(i)));
            }
        }
        //System.out.println(abc);
        
        for(int i=0;i<ch.length;i++){
            if(abc.contains(ch[i])){
                if(abc.indexOf(ch[i])+index<abc.size()){
                    ch[i]=abc.get(abc.indexOf(ch[i])+index);
                    continue;
                }
                //System.out.print(abc.indexOf(ch[i])+index-abc.size()+" "+i+" ");
                ch[i]=abc.get((abc.indexOf(ch[i])+index)%abc.size());     
            }
        }
        for(char c:ch){
            answer=answer.concat(String.valueOf(c));
            System.out.print(c);
        }
        return answer;
    }
}