import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer =new int[2];
        int num=0;
        int remain=0;
        Stack<String> stack=new Stack<>();
        for(int i=0;i<words.length;i++){
            //stack에 같은단어가 있을 시 정지  
            if(stack.contains(words[i])){
                System.out.println(i+1);
                num=(i+1)/n;
                remain=(i+1)%n;
                //System.out.println(num+" "+remain);
                if(remain==0){
                    answer[0]=n;
                    answer[1]=num;
                }
                else{
                    answer[0]=remain;
                    answer[1]=num+1;
                }
                break;
            }
            stack.add(words[i]);
            if(i>=1){
                String str=stack.get(stack.size()-2);
                //전에 나온 단어와 다음에 나온 단어가 끝말잇기 규칙에 어긋나면정지 
                if(str.charAt(str.length()-1)!=words[i].charAt(0)){
                    System.out.println(i+1);
                    num=(i+1)/n;
                    remain=(i+1)%n;
                    //System.out.println(num+" "+remain);
                    if(remain==0){
                    answer[0]=n;
                    answer[1]=num;
                }
                else{
                    answer[0]=remain;
                    answer[1]=num+1;
                }
                    break;
                }
            }
        }

        return answer;
    }
}