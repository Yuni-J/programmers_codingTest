package programmers01;

import java.util.Scanner;

public class Lv0_03 {
	// 문자열 반복해서 출력하기
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        System.out.print(result);
        
        sc.close();
    }

}
