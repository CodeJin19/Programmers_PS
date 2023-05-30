import java.util.*;

class Solution {
    
    static boolean[] isPrime = new boolean[1000010];

    public String converter(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while(n != 0) {
            int r = n % k;
            n /= k;
            sb.append(r);
        }

        return sb.reverse().toString();
    }

    public int solution(int n, int k) {
        //System.out.println(converter(n, k));
        StringTokenizer st = new StringTokenizer(converter(n, k), "0");
        HashMap<Integer, Integer> numberCnt = new HashMap<>();
        int answer = 0;

        isPrime[1] = false;

        for(int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for(int i = 2; i < isPrime.length; i++) {
            if(!isPrime[i]) {
                continue;
            }

            for(int j = i + i; j < isPrime.length;) {
                isPrime[j] = false;
                j += i;
            }
        }

        while(st.hasMoreTokens()) {
            Long num = Long.parseLong(st.nextToken());

            if(num <= 1000000L) {
                int intNum = num.intValue();

                if(isPrime[intNum]) {
                    answer++;
                }
            } else {
                int limit = (int) Math.sqrt(num);
                boolean flag = true;

                for(int i = 2; i <= limit + 1; i++) {
                    long r = num % (long) i;

                    if(r == 0L) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    answer++;
                }
            }
        }

        return answer;
    }
}