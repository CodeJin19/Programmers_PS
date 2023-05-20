//코딩테스트 연습 > 코딩테스트 입문 > 문자열 뒤집기

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i = len - 1; 0 <= i; i--) {
            sb.append(my_string.charAt(i));    
        }
        
        return sb.toString();
    }
}

// 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 뒤집기

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        for(int i = 0; i < len; i++) {
            if(s <= i && i <= e) {
                sb.append(my_string.charAt(s + e - i));
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}