package programmers01;

public class Lv0_44 {
	// 문자열의 뒤의 n글자

    public String solution(String my_string, int n) {
        
        return my_string.substring(my_string.length() - n);
    
    }
}