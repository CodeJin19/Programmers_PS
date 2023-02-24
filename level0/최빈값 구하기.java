class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int[] cnt = new int[1000];
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        
        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
            max = max < cnt[array[i]] ? cnt[array[i]] : max;
        }
        
        for(int i = 0; i < 1000; i++) {
            if(cnt[i] == max) {
                if(flag) {
                    return -1;
                } else {
                    flag = true;
                    answer = i;
                }
            }
        }
        
        return answer;
    }
}