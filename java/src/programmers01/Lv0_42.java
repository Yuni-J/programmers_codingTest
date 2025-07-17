package programmers01;

import java.util.*;

public class Lv0_42 {
	// 배열 만들기 5
	
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(String str : intStrs){
            String sub = str.substring(s, s + l);
            
            int i = Integer.parseInt(sub);
            
            if(i > k){
                answer.add(i);
            }
            
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}