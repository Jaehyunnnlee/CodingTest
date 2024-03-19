import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        String[] recordsArr;
        String[] carArr;
        int count=0,check=0,index=0;
        Set<String> carSet=new HashSet<>();
        for(int i=0;i<records.length;i++){
            recordsArr=records[i].split(" ");
            carSet.add(recordsArr[1]);
        }
        carArr=carSet.toArray(new String[0]);
        Arrays.sort(carArr);
        int[] answer=new int[carArr.length];
        for(String car:carArr){
            count=0;
            for(String str:records){
                if(str.contains(car)){
                    count++;
                }
            }
            List<Integer> parkList=new ArrayList<>();
            for(String str:records){
                recordsArr=str.split(" ");
                if(car.equals(recordsArr[1])){
                    int hour=Integer.parseInt(recordsArr[0].substring(0,2))*60;
                    int min=Integer.parseInt(recordsArr[0].substring(3,5));
                    parkList.add(hour+min);
                    check++;
                }
                if(check==count){
                    if(count%2!=0){
                        parkList.add(23*60+59);
                    }
                    check=0;
                }
            }
            int total=0;
            for(int i=parkList.size()-1;i>=1;i-=2){
                total+=(parkList.get(i)-parkList.get(i-1));
            }
            System.out.print(total+" ");
            if(total-fees[0]<=0){
                total=fees[1];
            }
            else if((total-fees[0])%fees[2]==0){
                total=(total-fees[0])/fees[2]*fees[3]+fees[1];
            }
            else if((total-fees[0])%fees[2]!=0){
                total=((total-fees[0])/fees[2]+1)*fees[3]+fees[1];
            }
            System.out.println(total);
            answer[index]=total;
            index++;
        }
        return answer;
    }
}