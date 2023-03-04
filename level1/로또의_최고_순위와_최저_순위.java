class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int corrects = 0;
        int zeros = 0;

        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                zeros++;
                continue;
            }

            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    corrects++;
                    break;
                }
            }
        }

        answer[0] = 7 - corrects - zeros;
        answer[1] = 7 - corrects;
        answer[0] = 6 < answer[0] ? 6 : answer[0];
        answer[1] = 6 < answer[1] ? 6 : answer[1];

        return answer;
    }
}