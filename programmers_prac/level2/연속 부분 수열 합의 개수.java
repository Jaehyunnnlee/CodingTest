import java.util.*;

class Solution {
    static int[] num;
    public int solution(int[] elements) {
        int answer = 0, sum = 0;
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<2;j++){
            for(int i=0;i<elements.length;i++){
                list.add(elements[i]);
            }
        }
        for(int i=0;i<elements.length;i++){
            int num=0;
            for(int j=0;j<elements.length;j++){
                num+=list.get(i+j);
                //System.out.println(num);
                set.add(num);
            }
        }
        
        return set.size();
    }
}