package programmers01;

public class Lv0_66 {
	// n개 간격의 원소들

    public int[] solution(int[] num_list, int n) {
        int len = (num_list.length + n - 1) / n;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++){
            answer[i] = num_list[i * n];
        }
        
        return answer;
    }
}