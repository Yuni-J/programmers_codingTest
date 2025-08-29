package programmers01;

public class Lv0_90 {
	// 문자열 바꿔서 찾기
	
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for(char ch : myString.toCharArray()){
            if(ch == 'A'){
                sb.append('B');
            } else if(ch == 'B'){
                sb.append('A');
            }
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}