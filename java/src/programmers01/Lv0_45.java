package programmers01;

import java.util.*;

public class Lv0_45  {
	// 접미사 배열
	
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
                answer[i] = my_string.substring(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}