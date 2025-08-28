package programmers01;

public class Lv0_89 {
    // 간단한 식 계산하기
    
    public int solution(String binomial) {
        int answer = 0;
        String[] math = binomial.split(" ");
        
        int a = Integer.parseInt(math[0]);
        int b = Integer.parseInt(math[2]);
        String op = math[1];
        
        switch(op){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}