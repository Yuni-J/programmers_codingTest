package programmers01;

import java.util.Scanner;

public class Lv0_10 {
	// 문자열 겹쳐쓰기
	
    public String solution(String my_string, String overwrite_string, int s) {
        String answer1 = my_string.substring(0, s); 
        String answer2 = my_string.substring(s + overwrite_string.length());
        
        return answer1 + overwrite_string + answer2;
    }
    
    public static void main(String[] args){
    	Lv0_10 sol = new Lv0_10();
        
        Scanner sc = new Scanner(System.in);
        
        String my_string = sc.nextLine();
        String overwrite_string = sc.next();
        int s = sc.nextInt();
        
        System.out.print(sol.solution(my_string, overwrite_string, s));
        
        sc.close();
    
    }
}
