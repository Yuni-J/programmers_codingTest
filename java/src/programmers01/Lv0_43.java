package programmers01;

public class Lv0_43 {
	// 부분 문자열 이어 붙여 문자열 만들기

    public String solution(String[] my_strings, int[][] parts) {

        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_strings.length; i++){
            
           String str = my_strings[i];
            
            int s = parts[i][0];
            int e = parts[i][1];
            
            answer.append(str.substring(s, e + 1));
            
        }
        
        return answer.toString();
    }
}