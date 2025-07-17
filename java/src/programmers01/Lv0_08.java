package programmers01;

import java.util.Scanner;

public class Lv0_08 {
	// 문자열 돌리기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for(int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		sc.close();
		
	}

}
