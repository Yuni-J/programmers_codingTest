package programmers01;

import java.util.*;

public class Lv0_65 {
    // n 번째 원소까지 
    
    public int[] solution(int[] num_list, int n) {
       
        return Arrays.copyOfRange(num_list, 0, n);
    }
}