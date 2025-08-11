package programmers01;

public class Lv0_76 {
	// 원하는 문자열 찾기
	
    public int solution(String myString, String pat) {       
        
        return (myString.toUpperCase()).contains(pat.toUpperCase()) ? 1 : 0;
    }
}