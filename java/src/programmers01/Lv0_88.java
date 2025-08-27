package programmers01;

import java.util.*;

public class Lv0_88 {
	// 문자열 잘라서 정렬하기

    public String[] solution(String myString) {
        String[] words = myString.split("x");
        List<String> answer = new ArrayList<>();
        
        for(String word : words){
            if(!word.isEmpty()){
                answer.add(word);
            }
        }
        
        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }
}