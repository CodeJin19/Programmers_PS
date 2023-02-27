class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] isPrime = new boolean[3200];

        for(int i = 2; i < 3200; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i < 3200; i++) {
            if(!isPrime[i]) {
                continue;
            }

            for(int j = i + i; j < 3200;) {
                isPrime[j] = false;
                j += i;
            }
        }

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(isPrime[nums[i] + nums[j] + nums[k]]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}