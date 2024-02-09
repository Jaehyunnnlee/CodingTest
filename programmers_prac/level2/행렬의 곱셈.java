class Solution {
/*
arr1=a*n arr2=n*b라고 하면 answer배열의 크기는 a*b
따라서 arr[0].length==arr2.length여야 함
3중배열을 통해 접근
*/
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                //System.out.print("arr1: "+i+","+j+" "+arr1[i][j]+" ");
                for(int k=0;k<arr2[0].length;k++){
                    {
                        //System.out.print("arr2: "+j+","+k+" "+arr2[j][k]+" ");
                    }
                    answer[i][k]+=arr1[i][j]*arr2[j][k];
                }
                // System.out.println();
            }
        }
        return answer;
    }
}