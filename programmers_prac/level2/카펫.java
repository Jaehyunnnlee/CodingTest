class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1;i<=yellow;i++){
            if(yellow%i==0){
                if(brown==(i+2)*2+yellow/i*2){
                    if(i+2>=yellow/i+2){
                        answer[0]=i+2;
                        answer[1]=yellow/i+2;
                    }
                }
            }
        }
        return answer;
    }
}