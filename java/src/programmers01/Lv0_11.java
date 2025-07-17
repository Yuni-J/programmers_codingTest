package programmers01;

import java.util.Scanner;

public class Lv0_11 {
	// 문자열 섞기
	
	  public String solution(String str1, String str2) {
	        String answer = "";
	        
	        for(int i = 0; i < str1.length(); i++){
	            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
	        }
	        
	        return answer;
	    }
	    
	    public static void main(String[] args){
	    	Lv0_11 sol = new Lv0_11();
	        Scanner sc = new Scanner(System.in);
	        
	        String str1 = sc.next();
	        String str2 = sc.next();
	        
	        System.out.println(sol.solution(str1, str2));
	        
	        sc.close();
	    }

}
