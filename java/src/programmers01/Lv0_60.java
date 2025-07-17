package programmers01;

public class Lv0_60 {
	// 2의 영역

	public int[] solution(int[] arr) {
        
        int start = -1;
        int last = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                }
                last = i; 
            } 
        }
        
        if(start == -1){
            return new int[]{-1};
        }
        
        int[] answer = new int[last - start + 1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[start + i];
        }
        
        return answer;        
    }
}