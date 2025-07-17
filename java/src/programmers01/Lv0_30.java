package programmers01;

public class Lv0_30 {
	// 수열과 구간 쿼리3
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++){
            
            int a = queries[i][0];
            int b = queries[i][1];
            
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            answer = arr;
        }

        return answer;
    }

}
