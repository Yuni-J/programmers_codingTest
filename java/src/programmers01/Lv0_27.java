package programmers01;

public class Lv0_27 {
	// 마지막 두 원소
	
	public int[] solution(int[] num_list) {
        int num = num_list.length;
        int[] answer = new int[num + 1];
        
        for(int i = 0; i < num; i++){
            answer[i] = num_list[i];
        }
        
        int last = num_list[num - 1];
        int before = num_list[num - 2];
        
        
        answer[num] = last > before ? last - before : 2 * last;
        
        return answer;
    }

}
