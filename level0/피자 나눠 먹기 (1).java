class Solution {
    public int solution(int n) {
        int answer = n / 7;
        
        if(0 < n % 7)
            answer++;
        
        return answer;
    }
}