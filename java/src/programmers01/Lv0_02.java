package programmers01;

import java.util.Scanner;

public class Lv0_02 {
	// a와 b 출력하기
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( "a = " + a + "\n" + "b = " + b);
    
        sc.close();
    }
	
}
