package programmers01;

public class Lv0_56 {
	// 가까운 1 찾기
	
    public int solution(int[] arr, int idx) {
        
        for(int i = 0; i < arr.length; i++){
            if(i >= idx && arr[i] == 1){ 
                return i;
            }
        }
    
        return -1;
    }
}