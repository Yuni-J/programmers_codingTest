package programmers01;

import java.util.*;

public class Lv0_86 {
    // 공백으로 구분하기 2
    
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<>();
        
        for(String str : answer){
            if(!str.equals("")){
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}