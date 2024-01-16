import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        //65, 90 ->대문자 97, 122 ->소문자
        //third(new_id);
        answer=fifth(fourth(third(exception(lowerCase(new_id)))));
        return answer;
    }
    //대문자를 소문자로 변환
    private String lowerCase(String new_id){
        String str="";
        char[] ch=new char[new_id.length()];
        for(int i=0;i<new_id.length();i++){
            ch[i]=new_id.charAt(i);
            if(ch[i]>=65&&ch[i]<=90){
                ch[i]+=32;
            }
            str=str.concat(String.valueOf(ch[i]));
        }
        //System.out.print(str);
        return str;
    }
    
    //0-9, a-z, -, _, . 제외하고 제거
    private String exception(String new_id){
        String str="";
        char[] ch=new char[new_id.length()];
        for(int i=0;i<new_id.length();i++){
            ch[i]=new_id.charAt(i);
            if(ch[i]>=97&&ch[i]<=122){
                str=str.concat(String.valueOf(ch[i]));
            }
            
            else if(ch[i]>=48&&ch[i]<=57){
                str=str.concat(String.valueOf(ch[i]));
            }
           
            else if(ch[i]==95||ch[i]==45||ch[i]==46){
                str=str.concat(String.valueOf(ch[i]));
            }
        }
        //System.out.print(str);
        return str;
    }
    //온점이 연달아 나올 시 하나만 남기고 제거
    private String third(String new_id){
        String str="";
        Stack<String> stack=new Stack<>();
        for(int i=0;i<new_id.length();i++){
            if(i<new_id.length()-1&&new_id.charAt(i)=='.'&&new_id.charAt(i+1)=='.'){
                continue;
            }
            stack.add(String.valueOf(new_id.charAt(i)));
        }
        //System.out.print(stack);
        for(String s:stack){
            str=str.concat(s);
        }
        return str;
    }
    
    //처음 마지막 온점 제거
    private String fourth(String new_id){
        String str="";
        Deque<String> dq=new ArrayDeque<>();
        for(int i=0;i<new_id.length();i++){
            dq.add(String.valueOf(new_id.charAt(i)));
        }
        
        while(dq.getFirst().equals(".")&&dq.size()>1){
                dq.removeFirst();
        }
        while(dq.getLast().equals(".")&&dq.size()>1){
            dq.removeLast();
        }

        for(String s:dq){
            if(dq.size()==1&&s.equals(".")){
                str=str.concat("aaa");
            }
            else{
                str=str.concat(s);
            }
        }
        if(dq.size()<3){
            str=str.concat(dq.getLast());
        }
        //System.out.print(str+" str의 길이"+str.length());
        return str;
    }
    
    //16자리가 넘어가면 15자리만큼 자르고 4번규칙 한번 더 적용
    private String fifth(String new_id){
        String str="";
        String str2="";
        Deque<String> dq=new ArrayDeque<>();
        for(int i=0;i<new_id.length();i++){
            dq.add(String.valueOf(new_id.charAt(i)));
        }
        while(dq.size()>15){
            dq.removeLast();
        }
        for(String s:dq){
            str=str.concat(s);
        }
        str2=str2.concat(fourth(str));
        System.out.println(dq);
        System.out.println(str);
        System.out.print(str2);
        return str2;
    }
}