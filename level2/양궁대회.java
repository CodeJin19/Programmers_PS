class Solution {
    public int[] getComb(int n, int[] info, int idx, int lefts, int[] shots) {
        if(lefts == 0 || info.length <= idx) {
            int[] ret = new int[12];
            int apeach = 0;
            int lion = 0;

            for(int i = 0; i < 11; i++) {
                if(shots[i] == 0 && info[i] == 0) {
                    continue;
                }

                if(shots[i] <= info[i]) {
                    apeach += 10 - i;
                } else {
                    lion += 10 - i;
                }
            }

            int leftsIdx = 10;
            int[] finalShots = new int[shots.length];

            for(int i = 0; i < finalShots.length; i++) {
                finalShots[i] = shots[i];
            }

            while(0 <= leftsIdx && 0 < lefts) {
                if(finalShots[leftsIdx] <= info[leftsIdx]) {
                    if(finalShots[leftsIdx] + lefts <= info[leftsIdx]) {
                        int diff = lefts;
                        finalShots[leftsIdx] += diff;
                        lefts -= diff;
                    } else {
                        int diff = info[leftsIdx] - finalShots[leftsIdx];
                        finalShots[leftsIdx] += diff;
                        lefts -= diff;
                    }
                } else {
                    finalShots[leftsIdx] += lefts;
                    lefts -= lefts;
                }

                leftsIdx--;
            }

            if(lion <= apeach) {
                ret[0] = -1;
            } else {
                ret[0] = lion - apeach;

                for(int i = 0; i < 11; i++) {
                    ret[1 + i] = finalShots[i];
                }
            }

            return ret;
        }

        int[] ret = new int[12];
        int[] tmp;
        ret[0] = -1;

        if(info[idx] < lefts) { //+1
            shots[idx] = info[idx] + 1;
            tmp = getComb(n, info, idx + 1, lefts - info[idx] - 1, shots);
            shots[idx] = 0;

            if(ret[0] < tmp[0]) {
                for(int i = 0; i < 12; i++) {
                    ret[i] = tmp[i];
                }
            } else if(ret[0] == tmp[0]) {
                boolean swap = false;

                for(int i = 11; 0 < i; i--) {
                    if(ret[i] < tmp[i]) {
                        swap = true;
                        break;
                    } else if(tmp[i] < ret[i]) {
                        break;
                    }
                }

                if(swap) {
                    ret = tmp;
                }
            }
        }

        tmp = getComb(n, info, idx + 1, lefts, shots);

        if(ret[0] < tmp[0]) {
            for(int i = 0; i < 12; i++) {
                ret[i] = tmp[i];
            }
        } else if(ret[0] == tmp[0]) {
            boolean swap = false;

            for(int i = 11; 0 < i; i--) {
                if(ret[i] < tmp[i]) {
                    swap = true;
                    break;
                } else if(tmp[i] < ret[i]) {
                    break;
                }
            }

            if(swap) {
                ret = tmp;
            }
        }

        return ret;
    }

    public int[] solution(int n, int[] info) {
        int[] answer = new int[12];
        int[] shots;
        int[] tmp;

        answer[0] = -1;

        for(int i = 0; i < 10; i++) {
            shots = new int[11];
            tmp = getComb(n, info, i, n, shots);

            if(answer[0] < tmp[0]) {
                for(int j = 0; j < 12; j++) {
                    answer[j] = tmp[j];
                }
            } else if(answer[0] == tmp[0]) {
                boolean swap = false;

                for(int j = 11; 0 < j; j--) {
                    if(answer[j] < tmp[j]) {
                        swap = true;
                        break;
                    } else if(tmp[i] < answer[i]) {
                        break;
                    }
                }

                if(swap) {
                    answer = tmp;
                }
            }
        }

        if(answer[0] == -1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            tmp = answer;
            answer = new int[11];

            for(int i = 0; i < 11; i++) {
                answer[i] = tmp[1 + i];
            }
        }

        return answer;
    }
}