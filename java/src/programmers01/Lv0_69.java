package programmers01;

import java.util.*;

public class Lv0_69 {
	// 할 일 목록

    public String[] solution(String[] todo_list, boolean[] finished) {
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}