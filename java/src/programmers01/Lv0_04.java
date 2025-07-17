package programmers01;

import java.util.Scanner;

public class Lv0_04 {
	// 대소문자 바꿔서 출력하기
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < a.length(); i++){
            char str = a.charAt(i);
            
            if(Character.isUpperCase(str)){
                result.append(Character.toLowerCase(str)); 
            } else if(Character.isLowerCase(str)){
                result.append(Character.toUpperCase(str));
            }
            
        }
        
        System.out.print(result.toString());
        
        sc.close();
    }

}
