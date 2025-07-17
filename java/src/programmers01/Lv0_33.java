package programmers01;

public class Lv0_33 {
	// 배열 만들기2

	public int[] solution(int l, int r) {
        int[] answer = new int[r - l + 1];
        int count = 0;
        
        for(int i = l; i <= r; i++){
            String num = String.valueOf(i);
            boolean isValid = true;
            
            for(char c : num.toCharArray()){
                if(c != '0' && c != '5'){
                    isValid = false;
                }
            }
            if(isValid){
                answer[count++] = i;
            }
        }
        
        if(count == 0){
            return new int[] {-1};
        }
        
        int[] result = new int[count];
        System.arraycopy(answer, 0, result, 0, count);
        
        return result;
    }

}
