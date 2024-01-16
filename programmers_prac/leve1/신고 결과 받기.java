import java.util.;

//신고 결과 받기
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        SetString reportSet=new HashSet();
        MapString,Integer reportMap=new HashMap();
        MapString,Integer resultMap=new HashMap();
        String[] reportPerson=new String[2];
        
        //중복된 신고를 제거하는 셋을 통해 제거
        for(String strreport){
            reportSet.add(str);
            reportPerson=str.split( );
            reportMap.put(reportPerson[1],0);
            resultMap.put(reportPerson[0],0);
        }
        
        //신고횟수를 report맵에 저장
        for(String strreportSet){
            reportPerson=str.split( );
            reportMap.put(reportPerson[1],reportMap.get(reportPerson[1])+1);
        }
        
        //결과 메일 수를 result맵에 저장
        for(String strreportSet){
            reportPerson=str.split( );
            if(reportMap.get(reportPerson[1])=k){
                resultMap.put(reportPerson[0],resultMap.get(reportPerson[0])+1);
            }
        }
        
        for(int i=0;iid_list.length;i++){
            if(resultMap.containsKey(id_list[i])){
                answer[i]=resultMap.get(id_list[i]);
            }
            else{
                answer[i]=0;
            }
        }
        
        //System.out.println(reportDq);
        //System.out.println(reportMap);
        //System.out.println(resultMap);
        return answer;
    }
}