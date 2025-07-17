package programmers01;

public class Lv0_13 {
	// 문자열 곱하기
	
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        
        return answer;
        
        // return my_string.repeat(k);
    }

}
