package programmers01;

public class Lv0_41 {
	// 문자열 여러 번 뒤집기
	
    public String solution(String my_string, int[][] queries) {
        
        char str[] = my_string.toCharArray();
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            while(s < e){
                char temp = str[s];
                str[s] = str[e];
                str[e] = temp;
                
                s++;
                e--;
            }
        }
        
        return new String(str);
        
    }

}
