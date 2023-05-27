class Solution {
    public int solution(String[] strArr) {
        int answer = Integer.MIN_VALUE;
        int[] cnt = new int[31];

        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            cnt[len]++;
        }

        for(int i = 1; i < cnt.length; i++) {
            answer = answer < cnt[i] ? cnt[i] : answer;
        }

        return answer;
    }
}