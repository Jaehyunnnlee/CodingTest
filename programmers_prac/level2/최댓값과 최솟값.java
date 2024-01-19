class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        String[] sArr=s.split(" ");
        for(String str:sArr){
            if(Integer.parseInt(str)<min){
                min=Integer.parseInt(str);
            }
            if(Integer.parseInt(str)>max){
                max=Integer.parseInt(str);
            }
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        answer=sb.toString();
        return answer;
    }
}