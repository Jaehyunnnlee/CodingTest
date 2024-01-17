import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        String[] giftSplitArr=new String[2];
        int[][] count=new int[friends.length][friends.length];
        int[] expectedGift=new int[friends.length];
        Map<String,Integer> giveMap=new HashMap<>();
        Map<String,Integer> takeMap=new HashMap<>();
        Map<String,Integer> giftScore=new HashMap<>();
        
        //giveMap과 takeMap초기화
        for(String str:friends){
            giveMap.put(str,0);
            takeMap.put(str,0);
        }
        
        //선물 횟수 관계를 2차원 배열로 나타냄
        for(int i=0;i<friends.length;i++){
            for(int j=0;j<friends.length;j++){
                for(String str:gifts){
                    if((friends[i]+" "+friends[j]).equals(str)){
                        count[i][j]+=1;
                    }
                }
                //System.out.print(count[i][j]+" ");
            }
            //System.out.println();
        }
        
        
        //giveMap과 takeMap에 각각 주고 받은 횟수 저장
        for(String str:gifts){
            giftSplitArr=str.split(" ");
            giveMap.put(giftSplitArr[0],giveMap.get(giftSplitArr[0])+1);
            takeMap.put(giftSplitArr[1],takeMap.get(giftSplitArr[1])+1);
        }
        
        //giveMap과 takeMap의 value를 통해 선물지수 값 계산 후 저장
        for(String str:friends){
            giftScore.put(str,giveMap.get(str)-takeMap.get(str));
        }
        
        //선물관계도를 통해 더 많이 선물한 사람의 expectedGift인덱스에 +1을 해주고 만약 선물한 수가 같다면 선물지수가 더 큰 사람의 expectedGift 인덱스에 +1을 해줌
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count.length;j++){
                if(count[i][j]>count[j][i]){
                    //System.out.print(friends[i]+" ");
                    expectedGift[i]+=1;
                }
                if(count[i][j]==count[j][i]){
                    //System.out.print("same ");
                    if(giftScore.get(friends[i])>giftScore.get(friends[j])){
                        expectedGift[i]+=1;
                    }
                }
            }
            //System.out.println();
        }
        
        //answer에 expectedGift중 가장 큰 값 저장
        for(int i:expectedGift){
            if(i>answer){
                answer=i;
            }
        }
        //System.out.println(giftScore);
        return answer;
    }
}