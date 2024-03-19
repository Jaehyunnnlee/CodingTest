class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<numbers.length;i++){
            sb.append(Long.toBinaryString(numbers[i]));
            //System.out.println(sb);
            if(numbers[i]%4==3){
                if(sb.indexOf("01")==-1){
                    sb.insert(0,1);
                    sb.deleteCharAt(1);
                    sb.insert(1,0);
                    answer[i]=Long.parseLong(sb.toString(),2);
                }
                else{
                    int index=sb.lastIndexOf("01");
                    sb.delete(index,index+2);
                    sb.insert(index,"10");
                    answer[i]=Long.parseLong(sb.toString(),2);
                }
                //System.out.println(Long.toBinaryString(answer[i]));
            }
            
            else{
                answer[i]=numbers[i]+1;
            }
            sb.delete(0,sb.length());
        }
        return answer;
    }
}