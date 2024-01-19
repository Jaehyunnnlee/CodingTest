class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        int count=0;
        String[] strArr;
        //모두 공백문자일 경우 sb에 공백문자 수 만큼 추가해줌
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        count=sb.length();
        strArr=s.split(" ");
        for(String str:strArr){
            if(str.isEmpty()){
                sb.append(" ");
            }
            //각 문자의 대/소문자 or 숫자인지 판별해서 적절히 변경
            for(int i=0;i<str.length();i++){
                if(i==0){
                    if(str.charAt(i)>=97&&str.charAt(i)<=122){
                        sb.append(" "+String.valueOf((char)(str.charAt(i)-32)));
                    }
                    
                    else{
                        sb.append(" "+String.valueOf(str.charAt(i)));
                    }
                }
                else if(i>0){
                    if(str.charAt(i)>=65&&str.charAt(i)<=90){
                        sb.append(String.valueOf((char)(str.charAt(i)+32)));
                    }
                    else{
                        sb.append(String.valueOf(str.charAt(i)));
                    }
                }
            }
            //System.out.println(str);
        }
        
        //맨 앞자리의 공백문자 여부 검사 && 앞에 추가해준 공백문자 제거
        if(s.charAt(0)!=' '){
            for(int i=0;i<count+1;i++){
                sb.deleteCharAt(0);
            }
        }
        //s의 마지막이 공백문자일 경우 공백문자를 추가해줌(split으로 사라지므로)
        if(s.charAt(s.length()-1)==' '){
            sb.append(" ");
        }
        System.out.print(sb);
        answer=sb.toString();
        return answer;
    }
}