package programmers01;

import java.util.*;

public class Lv0_73 {
    public int solution(int[] arr) {
        
        int count = 0;
        int[] preArr = arr.clone();
        
        while(true){
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            count++;
            
            if(Arrays.equals(arr, preArr)){
                count--;
                break;
            }
            
            preArr = arr.clone();
        }
        
        return count;
    }
}