class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int idx = 0;
        int min, cnt;

        while(idx < numlist.length) {
            min = Integer.MAX_VALUE;
            cnt = 0;

            for(int i = 0; i < numlist.length; i++) {
                if(numlist[i] < 0)
                    continue;

                int diff = numlist[i] - n;
                diff = diff < 0 ? 0 - diff : diff;

                if(diff < min) {
                    min = diff;
                    cnt = 1;
                } else if(diff == min) {
                    cnt++;
                }
            }

            for(int i = 0; i < numlist.length; i++) {
                if(numlist[i] < 0)
                    continue;

                int diff = numlist[i] - n;
                diff = diff < 0 ? 0 - diff : diff;

                if(diff == min) {
                    if(cnt == 2) {
                        if(n < numlist[i]) {
                            answer[idx] = numlist[i];
                            numlist[i] = -1;
                        } else {
                            answer[idx + 1] = numlist[i];
                            numlist[i] = -1;
                        }
                    } else {
                        answer[idx] = numlist[i];
                        numlist[i] = -1;
                        break;
                    }
                }
            }
            
            idx++;
            
            if(cnt == 2) {
                idx++;
            }
        }

        return answer;
    }
}