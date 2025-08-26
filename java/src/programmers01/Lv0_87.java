package programmers01;

public class Lv0_87 {
	// x 사이의 개수
	
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1);
        int[] answer = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}