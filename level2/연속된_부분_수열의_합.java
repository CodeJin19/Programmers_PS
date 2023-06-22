class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int minLen = 3000000;
        int s = 0;
        int e = 0;
        int sum = 0;

        do{
            if(k < sequence[e]) {
                break;
            }
            
            sum += sequence[e];
            e++;

            if(sum == k) {
                if(e - s < minLen) {
                    minLen = e - s;
                    answer[0] = s;
                    answer[1] = e - 1;
                }

                sum -= sequence[s++];
            } else if(k < sum) {
                while(k < sum) {
                    sum -= sequence[s++];

                    if(sum == k && e - s < minLen) {
                        minLen = e - s;
                        answer[0] = s;
                        answer[1] = e - 1;
                    }
                }
            }
        } while(e < sequence.length);

        return answer;
    }
}