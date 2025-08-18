package programmers01;

public class Lv0_81 {
    public String solution(String my_string, String alp) {
    	// 특정한 문자를 대문자로 바꾸기
    	
        char[] answer = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            if(answer[i] == alp.charAt(0)){
                answer[i] = Character.toUpperCase(answer[i]);
            }
        }
        

        
        return new String(answer);
    }
}