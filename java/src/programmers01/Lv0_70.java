package programmers01;

public class Lv0_70 {
	// n보다 커질 때까지 더하기
	
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
            if(answer > n){
                return answer;
            }
        }
        
        return answer;
    }
}