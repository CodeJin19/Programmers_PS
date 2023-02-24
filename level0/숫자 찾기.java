class Solution {
    public int solution(int num, int k) {
        String s = Integer.toString(num);
        int len = s.length();

        for(int i = 0; i < len ; i++) {
            if(k == s.charAt(i) - '0') {
                return i + 1;
            }
        }

        return -1;
    }
}