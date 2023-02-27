class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        boolean isNeg = false;

        for(int i = 0; i < array.length; i++) {
            int curDiff = Math.abs(array[i] - n);

            if(curDiff < diff) {
                answer = array[i];
                diff = curDiff;

                if(array[i] < n) {
                    isNeg = true;
                } else {
                    isNeg = false;
                }
            } else if(curDiff == diff && !isNeg && array[i] < n) {
                answer = array[i];
                isNeg = true;
            }
        }

        return answer;
    }
}