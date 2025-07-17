package programmers01;

public class Lv0_15 {
	// 두 수의 연산값 비교하기
	
	public int solution(int a, int b) {
        int answer1 = Integer.parseInt(a + "" + b);
        int answer2 = 2 * a * b;
        
        if(answer1 >= answer2){
            return answer1;
        } else {
            return answer2;
        } 
        
    }

}
