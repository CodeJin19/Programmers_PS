class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if(common[0] + common[2] == common[1] + common[1]) {
            answer = common[common.length - 1] + common[common.length - 1] - common[common.length - 2];
        } else {
            answer = common[common.length - 1] * common[common.length - 1] / common[common.length - 2];
        }
        return answer;
    }
}