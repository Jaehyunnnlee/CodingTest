import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] stringArr={};
        String[] privacyArr={};
        List<String> answerArr=new ArrayList<>();
        Set<Integer> answerSet=new HashSet<>();
        int today_year=0, today_month=0, today_day=0;
        int privacy_year=0, privacy_month=0, privacy_day=0;
        Map<String,Integer> termsMap=new HashMap<>();
        stringArr=today.split("\\.");
        today_year=Integer.parseInt(stringArr[0]);
        today_month=Integer.parseInt(stringArr[1]);
        today_day=Integer.parseInt(stringArr[2]);
        //System.out.print("오늘\n"+today_year+"."+today_month+"."+today_day+"\n");
        for(String str:terms){
            stringArr=str.split(" ");
            termsMap.put(stringArr[0],Integer.parseInt(stringArr[1]));
        }
        System.out.println(termsMap);
        
        //System.out.println("유효기간 만료날짜");
        
        for(String str:privacies){
            stringArr=str.split(" ");
            privacyArr=stringArr[0].split("\\.");
            privacy_year=Integer.parseInt(privacyArr[0]);
            privacy_month=Integer.parseInt(privacyArr[1]);
            privacy_day=Integer.parseInt(privacyArr[2]);
            privacy_month+=termsMap.get(stringArr[1]);
            //System.out.println(privacy_month);
            while(privacy_month>12){
                privacy_year+=1;
                privacy_month-=12;
            }
            
            //System.out.print(privacy_year+"."+privacy_month+"."+privacy_day+"\n");
            if(privacy_year<today_year){
                answerArr.add(str);
            }
            if(privacy_year==today_year&&privacy_month<today_month){
                answerArr.add(str);
            }
            if(privacy_year==today_year&&privacy_month==today_month&&privacy_day<=today_day){
                answerArr.add(str);
            }
        }
        
        //System.out.println("만료기간 지난것들");
        System.out.println(answerArr);
        for(int i=0;i<privacies.length;i++){
            for(String str:answerArr){
                if(privacies[i].equals(str)){
                    answerSet.add(i+1);
                }
            }
        }
        //Collections.sort(arr);
        //System.out.println(answerSet);
        int[] answer=new int[answerArr.size()];
        int j=0;
        for(int i:answerSet){
            answer[j]=i;
            j++;
        }
        Arrays.sort(answer);
        return answer;
    }
}