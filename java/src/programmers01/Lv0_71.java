package programmers01;

public class Lv0_71 {
	// 수열과 구간 쿼리 1
	
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];

            for(int j = a; j <= b; j++){
                arr[j]++;
            }
        }
        
        return arr;
    }
}