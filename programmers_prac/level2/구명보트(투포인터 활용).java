import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int start=0,end=people.length-1,sum=0;
        Arrays.sort(people);
        for(int i=0;i<people.length;i++){
            //System.out.print(people[i]+" ");
        }
        //System.out.println();
        while(start<=end){
            if(people[start]+people[end]<=limit){
                //System.out.println(people[start]+" "+people[end]);
                start++;
                end--;
            }
            else{
                //System.out.println(people[end]);
                end--;
            }
            answer++;
            //System.out.println();
        }
        return answer;
    }
}