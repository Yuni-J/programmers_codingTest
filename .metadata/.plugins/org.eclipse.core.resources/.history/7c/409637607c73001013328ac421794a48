package programmers01;

public class Lv0_75 {
	// 길이에 따른 연산
	
	public int solution(int[] num_list) {

        int len = num_list.length;
        int answer = (len < 11) ? 1 : 0;
        
        for(int num : num_list){
            if(len < 11){
                answer *= num;
            } else{
                answer += num;                
            }
        }
        
        return answer;
    }
}