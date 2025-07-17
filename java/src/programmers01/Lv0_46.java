package programmers01;

public class Lv0_46 {
	// 접미사인지 확인하기
	
    public int solution(String my_string, String is_suffix) {
        
        for(int i = 0; i < my_string.length(); i++){
            String suffix = my_string.substring(i);
            
            if(suffix.equals(is_suffix)){
                return 1;
            } 
        }

        return 0;
 
    }
}
