class Solution {
/*
(0,0) = 1
(0,1) (1,0) (1,1) = 2
규칙을 살펴보면 행,열중 가장 큰수 +1이 그 인덱스의 값임
따라서 left~right까지를 n으로 나눈 몫+1,나머지+1 둘 중 큰 값이 해당 인덱스의 값
0/3 = 0...0
1/3 = 0...1
2/3 = 0...2
3/3 = 1...0
4/3 = 1...1
5/3 = 1...2
6/3 = 2...0
7/3 = 2...1
8/3 = 2...2	 

0/4 = 0...0
1/4 = 0...1
2/4 = 0...2
3/4 = 0...3
4/4 = 1...0
5/4 = 1...1
6/4 = 1...2

(0,0) = 1
(0,1) (1,0) (1,1) = 2
*/
    public int[] solution(int n, long left, long right) {
        int[] answer=new int[(int)right-(int)left+1];
        int k=0;
        for(long i=left;i<right+1;i++){
            answer[k]=Integer.max((int)(i/n)+1,(int)(i%n)+1);
            k++;
        }
        return answer;
    }
}
/*
다음과 같이 모든 배열을 대입해서 풀면 시간 초과(시간복잡도와 알고리즘,규칙 생각이 중요)
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        if(i>j){
            arr[i][j]=i+1;
        }
        else{
            arr[i][j]=j+1;
        }
        secondArr[k]=arr[i][j];
        System.out.print(arr[i][j]+" ");
        k++;
    }
    System.out.println();
}
k=0;
for(int i=0;i<n*n;i++){
    System.out.print(secondArr[i]+" ");
}
for(int i=(int)left;i<(int)(right+1);i++){
    answer[k]=secondArr[i];
    k++;
}
*/