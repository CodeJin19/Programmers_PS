//코딩테스트 연습 / 코딩테스트 입문 / 두 수의 합

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}

//----------------------------------------------------
//코딩테스트 연습 / 코딩 기초 트레이닝 / 두 수의 합


import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        BigInteger answer = x.add(y);
        
        return answer.toString();
    }
}