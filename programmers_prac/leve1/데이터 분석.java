import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list=new ArrayList<>();
        
        
        if(ext.equals("code")){
            for(int[] arr:data){
                if(arr[0]<val_ext){
                    list.add(arr);
                }
            }
        }
        if(ext.equals("date")){
            for(int[] arr:data){
                if(arr[1]<val_ext){
                    list.add(arr);
                }
            }
        }
        if(ext.equals("maximum")){
            for(int[] arr:data){
                if(arr[2]<val_ext){
                    list.add(arr);
                }
            }
        }
        
        if(ext.equals("remain")){
            for(int[] arr:data){
                if(arr[3]<val_ext){
                    list.add(arr);
                }
            }
        }
        
        int[][] answer=new int[list.size()][];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        
        if(sort_by.equals("code")){
            Arrays.sort(answer,new Comparator<int[]>(){
                
                public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }});
        }
        if(sort_by.equals("date")){
            Arrays.sort(answer,new Comparator<int[]>(){
               
                public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }});
        }
        if(sort_by.equals("maximum")){
            Arrays.sort(answer,new Comparator<int[]>(){
                
                public int compare(int[] o1, int[] o2) {
                return o1[2]-o2[2];
            }});
        }
        if(sort_by.equals("remain")){
            Arrays.sort(answer,new Comparator<int[]>(){
                
                public int compare(int[] o1, int[] o2) {
                return o1[3]-o2[3];
            }});
        }
        
        return answer;
    }
}