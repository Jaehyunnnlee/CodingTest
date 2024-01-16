class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n=board.length, count=0,h_check=0,w_check=0;
        String color=board[h][w];
        int[] dh={0,1,-1,0};
        int[] dw={1,0,0,-1};
        System.out.println(h+" "+w);
        for(int i=0;i<4;i++){
            h_check=h+dh[i];
            w_check=w+dw[i];
            System.out.println(h_check+" "+w_check);
            if(h_check>=0&&h_check<n&&w_check>=0&&w_check<n){
                if(color.equals(board[h_check][w_check])){
                    count+=1;
                }
                System.out.println(board[h_check][w_check]);
            }
        }
        answer=count;
        return answer;
    }
}