class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int idx = 0;
        int e;

        while(idx < section.length) {
            if(n - m + 1 < section[idx]) {
                answer++;
                break;
            }

            answer++;
            e = section[idx] + m;

            while(idx < section.length && section[idx] < e) {
                idx++;
            }
        }
        
        return answer;
    }
}