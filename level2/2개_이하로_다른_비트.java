class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            StringBuilder sb = new StringBuilder();
            boolean zeroFlag = false;

            if(num == 0) {
                answer[i] = 1L;
                continue;
            }

            while(num != 0) {
                int r = (int)(num % 2);
                sb.append(r);
                num /= 2;

                if(r == 0) {
                    zeroFlag = true;
                }
            }

            String str = sb.toString();
            int len = str.length();
            
            if(zeroFlag) {
               if(str.charAt(0) == '0') {
                   sb = new StringBuilder();
                   sb.append("1");

                   for(int j = 1; j < len; j++) {
                       sb.append(str.charAt(j));
                   }

                   str = sb.toString();
               } else {
                   int zeroIdx = 0;

                   while(zeroIdx < len) {
                       if(str.charAt(zeroIdx) == '0') {
                           break;
                       }

                       zeroIdx++;
                   }

                   sb = new StringBuilder();

                   for(int j = 0; j < zeroIdx - 1; j++) {
                       sb.append(str.charAt(j));
                   }

                   sb.append("01");

                   for(int j = zeroIdx + 1; j < len; j++) {
                       sb.append(str.charAt(j));
                   }

                   str = sb.toString();
               }
            } else {
                sb = new StringBuilder();

                for(int j = 0; j < len - 1; j++) {
                    sb.append(str.charAt(j));
                }

                sb.append("01");

                str = sb.toString();
            }

            long target = 0;
            len = str.length();

            for(int j = len - 1; 0 <= j; j--) {
                target *= 2;

                if(str.charAt(j) == '1') {
                    target += 1;
                }
            }

            answer[i] = target;
        }

        return answer;
    }
}