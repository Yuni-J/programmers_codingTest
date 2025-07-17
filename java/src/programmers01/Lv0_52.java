package programmers01;

public class Lv0_52 {
	// 문자 개수 세기
	
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++){
            int str = my_string.charAt(i);
            
            if(str >= 65 && str <= 90){
                answer[str - 65]++;
            } else if (str >= 97 && str <= 122){
                answer[str - 97 + 26]++;
            }
        }
        
        // 방법 2 : 문자로 치환
        // for(char str : my_string.toCharArray()){
        //     if('A' <= str && str <= 'Z'){
        //         answer[str - 'A']++;
        //     } else if('a' <= str && str <= 'z'){
        //         answer[str - 'a' + 26]++;
        //     } 
        // }
        
        return answer;
    }
}