class Solution {
    public int solution(String before, String after) {
        int[] beforeCnt = new int[26];
        int[] afterCnt = new int[26];
        int len = before.length();

        for(int i = 0; i < len; i++) {
            int idx = (int) (before.charAt(i) - 'a');
            beforeCnt[idx]++;
        }

        for(int i = 0; i < len; i++) {
            int idx = (int) (after.charAt(i) - 'a');
            afterCnt[idx]++;
        }

        for(int i = 0; i < 26; i++) {
            if(beforeCnt[i] != afterCnt[i]) {
                return 0;
            }
        }

        return 1;
    }
}