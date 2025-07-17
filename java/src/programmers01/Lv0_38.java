package programmers01;

import java.util.Arrays;

public class Lv0_38 {
	// 주사위 게임 3
	
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3]; // 네 주사위가 모두 같은 값
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2); // 세 주사위가 같고 하나가 다른 경우
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]); // 두 숫자가 두 번씩 나오는 경우
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3]; // 두 숫자가 하나씩 나오는 경우
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3]; // 두 숫자가 하나씩 나오는 경우
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1]; // 두 숫자가 하나씩 나오는 경우
        } else {
            ans = dice[0]; // 네 주사위가 모두 다른 경우
        }

        return ans;
    }
}