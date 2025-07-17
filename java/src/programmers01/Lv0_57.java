package programmers01;

import java.util.Arrays;

public class Lv0_57 {
	// 리스트 자르기
	
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        switch(n){
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                int len = (b - a) / c + 1;
                answer = new int[len];
                for(int i = 0; i < len; i++){
                    answer[i] = num_list[a + i * c];
                }
                break;
        }
        
        return answer;
    }
}