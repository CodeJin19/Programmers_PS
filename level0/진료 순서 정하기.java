class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int idx, max;

        for(int i = 1; i <= emergency.length; i++) {
            max = -1;
            idx = -1;

            for(int j = 0; j < emergency.length; j++) {
                if(max < emergency[j]) {
                    max = emergency[j];
                    idx = j;
                }
            }

            answer[idx] = i;
            emergency[idx] = -1;
        }

        return answer;
    }
}