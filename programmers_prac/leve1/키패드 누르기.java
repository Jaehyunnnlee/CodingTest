class Solution {
    public static int a=0;
    public int calculateDistance(int start,int end){
        int distance=0;
        if(start==0){
            start=11;
        }
        if(end==0){
            end=11;
        }
        int endIndex=0;
        if(end==2){
            endIndex=0;
        }
        else if(end==5){
            endIndex=1;
        }
        else if(end==8){
            endIndex=2;
        }
        else if(end==11){
            endIndex=3;
        }

        int arr[][]={{1,2,3,4}, {0,1,2,3}, {1,2,3,4}, {2,1,2,3},
             {1,0,1,2}, {2,1,2,3}, {3,2,1,2}, {2,1,0,1},
             {3,2,1,2}, {4,3,2,1},{3,2,1,0},{4,3,2,1}};
        /*
        for(int i=0;i<12;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        */
        
        distance=arr[start-1][end-endIndex*2-2];
        
        System.out.println("start="+start+" end="+end+" ");
        System.out.println("distance="+distance);
        a++;
        return distance;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHandVisit=10;
        int rightHandVisit=12;
        int distanceLeftHand=0;
        int distanceRightHand=0;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                leftHandVisit=numbers[i];
                answer=answer.concat("L");
                continue;
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                rightHandVisit=numbers[i];
                answer=answer.concat("R");
                continue;
            }
                
            else{
            distanceLeftHand=calculateDistance(leftHandVisit,numbers[i]);
            distanceRightHand=calculateDistance(rightHandVisit,numbers[i]);
                if(distanceLeftHand<distanceRightHand){
                       leftHandVisit=numbers[i];
                        answer=answer.concat("L");
                        continue;
                }
                else if(distanceLeftHand>distanceRightHand){
                    rightHandVisit=numbers[i];
                    answer=answer.concat("R");
                    continue;
                }
                else if(distanceLeftHand==distanceRightHand){
                    if(hand.equals("left")){
                        leftHandVisit=numbers[i];
                        answer=answer.concat("L");
                        continue;
                    }
                    else {
                        rightHandVisit=numbers[i];
                        answer=answer.concat("R");
                        continue;
                    }
                }
            }
        }
        //System.out.print("leftHandVisit="+leftHandVisit+" "+"rightHandVisit="+rightHandVisit);
        return answer;
    }
}