package programmers01;

public class Lv0_47 {
	// 문자열의 앞의 n글자
	
    public String solution(String my_string, int n) {
        String answer = "";
        
       for(int i = 0; i < n; i++){
           answer += my_string.charAt(i);
       }
        
        return answer;
    }
}