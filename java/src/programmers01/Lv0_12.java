package programmers01;

public class Lv0_12 {
	// 문자 리스트를 문자열로 변환하기
	
    public String solution(String[] arr) {
        String answer = "";
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }

}
