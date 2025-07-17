package programmers01;

import java.util.Scanner;

public class Lv0_06 {
	// 덧셈식 출력하기
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        System.out.println(a + " + " + b + " = " + c);
        System.out.printf("%d + %d = %d%n", a, b, c);
        
        sc.close();
    }

}
