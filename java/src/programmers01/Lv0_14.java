package programmers01;

public class Lv0_14 {
	// 더 크게 합치기
	
    public int solution(int a, int b) {        
        int answer1 = Integer.parseInt(a + "" + b);
        int answer2 = Integer.parseInt(b + "" + a);      
        
        return answer1 > answer2 ? answer1 : answer2;
    }
    
}
