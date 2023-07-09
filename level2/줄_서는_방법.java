class Solution {
    public int[] solve(int idx, int n, long k, int[] arr, boolean[] cache) {
        if(idx == arr.length) {
            return arr;
        }

        int[] ret = new int[arr.length];

        long val = 1;

        for(int i = n - 1 - idx; 0 < i; i--) {
            val *= i;
        }

        if(k <= val) {
            for(int i = 1; i < cache.length; i++) {
                if(!cache[i]) {
                    arr[idx] = i;
                    cache[i] = true;
                    break;
                }
            }
            ret = solve(idx + 1, n, k, arr, cache);
        } else {
            long sum = val;
            int cnt = 1;

            while(sum < k) {
                sum += val;
                cnt++;
            }

            int tmp = 0;

            for(int i = 1; i < cache.length; i++) {
                if(!cache[i]) {
                    tmp++;
                    if(cnt == tmp) {
                        arr[idx] = i;
                        cache[i] = true;
                        break;
                    }
                }
            }

            long diff = val * (cnt - 1);

            ret = solve(idx + 1, n, k - diff, arr, cache);
        }

        return ret;
    }


    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        boolean[] cache = new boolean[n + 1];

        answer = solve(0, n, k, answer, cache);

        return answer;
    }
}