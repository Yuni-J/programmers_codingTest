package programmers01;

 public class Lv0_49 {
	 // 문자열 뒤집기
	 
    public String solution(String my_string, int s, int e) {
        
        char[] str = my_string.toCharArray();
        
        while(s < e){
            char temp = str[s];
            str[s] = str[e];
            str[e] = temp;
            s++;
            e--;
        }

        return new String(str);
    }
}