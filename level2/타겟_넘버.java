class Solution {

    public int dfs(int[] numbers, int target, int current, int rest, int idx) {
        if(current < target && current + rest < target) {
            return 0;
        }

        if(target < current && target < current - rest) {
            return 0;
        }

        if(numbers.length <= idx) {
            if(current == target) {
                return 1;
            } else {
                return 0;
            }
        }

        int ret = 0;

        ret += dfs(numbers, target, current + numbers[idx], rest - numbers[idx], idx + 1);

        ret += dfs(numbers, target, current - numbers[idx], rest - numbers[idx], idx + 1);

        return ret;
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int rest = 0;

        for(int i = 0; i < numbers.length; i++) {
            rest += numbers[i];
        }

        answer = dfs(numbers, target, 0, rest, 0);

        return answer;
    }
}