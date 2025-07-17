package programmers01;

public class Lv0_20 {
	// 조건 문자열
	
    public int solution(String ineq, String eq, int n, int m) {
        
        String math = ineq + eq;
        
        if(math.equals(">=")){
            return n >= m ? 1 : 0;
        } else if(math.equals("<=")){
            return n <= m ? 1 : 0;
        } else if(math.equals(">!")){
            return n > m ? 1 : 0;
        } else if(math.equals("<!")){
            return n < m ? 1 : 0;
        }
        
        return 0;
    }

}
