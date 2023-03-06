class Solution {
    public int[] solution(String s) {
        int[] answer = new int[] {0, 0};
        int len = s.length();
        int next;

        while(len != 1 || s.charAt(0) != '1') {
            next = 0;

            for(int i = 0; i < len; i++) {
                if(s.charAt(i) == '1') {
                    next++;
                } else {
                    answer[1]++;
                }
            }

            StringBuilder tmp = new StringBuilder();

            while(next != 0) {
                int r = next % 2;
                next /= 2;

                tmp.append(r);
            }

            answer[0]++;
            s = tmp.reverse().toString();
            len = s.length();
        }

        return answer;
    }
}