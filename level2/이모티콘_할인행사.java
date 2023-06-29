class Solution {
    public int[] cal(int[][] users, int[] emoticons, int[] disRates) {
        int[] ret = new int[2];

        for(int i = 0; i < users.length; i++) {
            int sum = 0;

            for(int j = 0; j < emoticons.length; j++) {
                if(users[i][0] <= disRates[j]) {
                    int p = emoticons[j] / 100;
                    p *= (100 - disRates[j]);
                    sum += p;
                }
            }
            
            if(users[i][1] <= sum) {
                ret[0]++;
            } else {
                ret[1] += sum;
            }
        }

        return ret;
    }

    public int[] getCom(int[][] users, int[] emoticons, int[] disRates, int idx) {
        if(idx == emoticons.length) {
            return cal(users, emoticons, disRates);
        }

        int[] tmp;
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;

        for(int i = 10; i < 50; i += 10) {
            disRates[idx] = i;
            tmp = getCom(users, emoticons, disRates, idx + 1);

            if(ret[0] < tmp[0]) {
                ret = tmp;
            } else if(ret[0] == tmp[0]) {
                if(ret[1] < tmp[1]) {
                    ret = tmp;
                }
            }
        }

        return ret;
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int[] disRates = new int[emoticons.length];
        return getCom(users, emoticons, disRates, 0);
    }
}