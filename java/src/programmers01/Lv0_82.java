package programmers01;

public class Lv0_82 {
    public String solution(String myString, String pat) {
    	// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

        int index = myString.lastIndexOf(pat);;
        
        return myString.substring(0, index + pat.length());
    }
}