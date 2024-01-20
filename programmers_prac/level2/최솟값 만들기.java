import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int minA=Integer.MAX_VALUE,maxB=Integer.MIN_VALUE;
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        
        for(int i=0;i<A.length;i++){
            a.add(A[i]);
        }
        for(int i=0;i<B.length;i++){
            b.add(B[i]);
        }
        //가장 작은 수가 맨뒤로
        Collections.sort(a,Collections.reverseOrder());
        //가장 큰 수가 맨뒤로
        Collections.sort(b);
        //System.out.println(a);
        //System.out.println(b);
        while(!a.isEmpty()){
            //가장 큰 수* 가장 작은수
            answer+=a.get(a.size()-1)*b.get(a.size()-1);
            if(a.size()>0){
                a.remove(a.size()-1);
                b.remove(b.size()-1);
            }
        }
        return answer;
    }
}