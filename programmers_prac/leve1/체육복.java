import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        for(int i=0;i<lost.length;i++){
            arr[lost[i]-1]-=1;
        }
        for(int i=0;i<reserve.length;i++){
            arr[reserve[i]-1]+=1;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int i=0;i<arr.length;i++){
            if(i>0&&arr[i-1]==0&&arr[i]==2){
                arr[i]-=1;
                arr[i-1]+=1;
            }
            
            if(i<arr.length-1&&arr[i+1]==0&&arr[i]==2){
                arr[i]-=1;
                arr[i+1]+=1;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if(arr[i]>0){
                answer+=1;
            }
        }
        return answer;
    }
}