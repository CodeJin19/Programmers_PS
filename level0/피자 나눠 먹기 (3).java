class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice;
        
        if(0 < n % slice) {
            answer++;
        }
        
        return answer;
    }
}