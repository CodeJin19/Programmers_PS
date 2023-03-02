class Solution {
    public int solution(String A, String B) {
        int len = A.length();
        int aIdx, bIdx;

        for(int i = 0; i < len; i++) {
            if(A.charAt(0) == B.charAt(i)) {
                aIdx = 0;
                bIdx = i;

                while(aIdx < len && A.charAt(aIdx) == B.charAt(bIdx)) {
                    aIdx++;
                    bIdx++;
                    bIdx %= len;
                }

                if(aIdx == len)
                    return i;
            }
        }

        return -1;
    }
}