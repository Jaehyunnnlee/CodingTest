import java.util.Scanner;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count=0;
        int count_zero=0;
        int bestWay=0;
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                count_zero+=1;
            }
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    count+=1;
                }
            }
        }
        bestWay=count_zero+count;
        if(bestWay<20){
            answer[0]=6;
        }
        if(bestWay==2){
            answer[0]=5;
        }
        if(bestWay==3){
            answer[0]=4;
        }if(bestWay==4){
            answer[0]=3;
        }
        if(bestWay==5){
            answer[0]=2;
        }
        if(bestWay==6){
            answer[0]=1;
        }
        if(count<2){
            answer[1]=6;
        }
        if(count==2){
            answer[1]=5;
        }
        if(count==3){
            answer[1]=4;
        }
        if(count==4){
            answer[1]=3;
        }
        if(count==5){
            answer[1]=2;
        }
        if(count==6){
            answer[1]=1;
        }
        for(int i=0;i< answer.length;i++){
            System.out.print(answer[i]+" ");
        }
        return answer;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        구명보트 sol=new 구명보트();
        int[] lottos=new int[6];
        int[] win_nums=new int[6];
        System.out.println("로또 번호 입력: ");
        for(int i=0;i<6;i++){
            lottos[i]=scan.nextInt();
        }
        System.out.println("당첨 번호 입력: ");
        for(int i=0;i<6;i++){
            win_nums[i]=scan.nextInt();
        }
        sol.solution(lottos,win_nums);
    }
}