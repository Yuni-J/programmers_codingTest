package programmers01;

import java.util.*;

public class Lv0_84 {
	// ad 제거하기
	
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for(String str : strArr){
            if(!str.contains("ad")){
                answer.add(str);
            }
        }
        return answer.toArray(new String[0]);

    }
}