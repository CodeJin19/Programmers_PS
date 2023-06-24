class Solution {
    int[][] fatigueArr = {{1, 1, 1}, {5, 1, 1}, {25, 5, 1}};

    public int solve(int[] lefts, String[] minerals, int idx, int currentFatigue, int answer) {
        if(answer < currentFatigue) {
            return Integer.MAX_VALUE;
        }
        
        int ret = answer;
        int skipCnt = 0;

        for(int i = 0; i < 3; i++) {
            if(lefts[i] == 0) {
                skipCnt++;
                continue;
            }

            lefts[i]--;
            int cnt = 0;
            int idxD = 0;
            int fatigueD = 0;

            while(idx + idxD < minerals.length && cnt < 5) {
                int tmpIdx = 0;

                if(minerals[idx + idxD].charAt(0) == 'd') {
                    tmpIdx = 0;
                } else if(minerals[idx + idxD].charAt(0) == 'i') {
                    tmpIdx = 1;
                } else if(minerals[idx + idxD].charAt(0) == 's') {
                    tmpIdx = 2;
                }

                fatigueD += fatigueArr[i][tmpIdx];
                idxD++;
                cnt++;
            }
            
            if(idx == minerals.length) {
                ret = Math.min(currentFatigue + fatigueD, ret);
            } else {
                ret = solve(lefts, minerals, idx + idxD, currentFatigue + fatigueD, answer);
                answer = Math.min(answer, ret);
                ret = Math.min(answer, ret);
            }
            
            lefts[i]++;
        }
        
        if(skipCnt == 3) {
            return currentFatigue;
        } else {
            return ret;
        }
    }

    public int solution(int[] picks, String[] minerals) {
        int answer = solve(picks, minerals, 0, 0, Integer.MAX_VALUE);
        return answer;
    }
}