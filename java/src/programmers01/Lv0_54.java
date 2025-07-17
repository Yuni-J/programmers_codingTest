package programmers01;

import java.util.*;

public class Lv0_54 {
	// 글자 지우기
	
    public String solution(String my_string, int[] indices) {
        
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        
        for(int i = indices.length - 1; i >= 0 ; i--){
            answer.deleteCharAt(indices[i]);
        }
        
        return answer.toString();
    }
}