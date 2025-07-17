package programmers01;

public class Lv0_22 {
	// 코드 처리하기
	
	public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            
            if(c == '1'){
                mode = 1 - mode;
                continue;
            }
            
            if(mode == 0 && i % 2 == 0){
                ret += c;
            } else if(mode == 1 && i % 2 == 1){
                ret += c;
            }
    
        }
        
        if(ret.length() == 0){
            return "EMPTY";
        }

        return ret;
    }

}
