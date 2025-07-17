package programmers01;

public class Lv0_39 {
	// 글자 이어 붙여 문자열 만들기
	
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for(int index : index_list){
            answer += my_string.charAt(index);
        }
        
        return answer;
    }

}