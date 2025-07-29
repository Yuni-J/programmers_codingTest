package programmers01;

public class Lv0_68 {
	// 5명씩
	
    public String[] solution(String[] names) {
        int len = (names.length + 4) / 5;
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++){
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}