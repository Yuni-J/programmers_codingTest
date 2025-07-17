package programmers01;

public class Lv0_37 {
	// 간단한 논리 연산

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);
        
        return answer;
    }
}
