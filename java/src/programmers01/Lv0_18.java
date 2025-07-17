package programmers01;

public class Lv0_18 {
	// 홀짝에 따라 다른 값 반환하기
	
	public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0){
            for(int i = 0; i <= n; i++){
                if(i % 2 == 0){
                    answer += Math.pow(i, 2);
                }
            }
        } else {
            for(int i = 0; i <= n; i++){
                if(i % 2 == 1){
                    answer += i;
                }
            }
        }
         
        return answer;
    }

}
