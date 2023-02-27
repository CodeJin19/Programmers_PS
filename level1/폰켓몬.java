class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] cache = new boolean[200010];
        
        for(int i = 0; i < nums.length; i++) {
            if(!cache[nums[i]]) {
                answer++;
                cache[nums[i]] = true;
                
                if(answer == nums.length / 2) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}