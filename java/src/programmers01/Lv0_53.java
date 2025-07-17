package programmers01;

public class Lv0_53 {
	// 배열 만들기 1

    public int[] solution(int n, int k) {
        int m = n / k;
        int[] answer = new int[m];
        
        for(int i = 1; i <= m; i++){
            answer[i - 1] = k * i;
        }
        
        return answer;
    }
}