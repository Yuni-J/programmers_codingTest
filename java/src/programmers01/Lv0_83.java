package programmers01;

public class Lv0_83 {
	// 문자열이 몇 번 등장하는지 세기
	
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;
        
        while((index = myString.indexOf(pat, index)) != -1){
            count++;
            index++;
        }
        
        
        return count;
    }
}