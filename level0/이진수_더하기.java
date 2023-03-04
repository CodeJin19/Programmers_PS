class Solution {
    public String solution(String bin1, String bin2) {
        /*
        StringBuilder sb = new StringBuilder();
        int len1 = bin1.length();
        int len2 = bin2.length();

        if(len2 < len1) {
            int tmpInt = len2;
            len2 = len1;
            len1 = tmpInt;

            String tmpStr = bin2;
            bin2 = bin1;
            bin1 = tmpStr;
        }

        int carry = 0;
        int num1, num2, num;

        for(int i = 0 ; i < len1; i++) {
            num1 = (int) (bin1.charAt(len1 - 1 - i) - '0');
            num2 = (int) (bin2.charAt(len2 - 1 - i) - '0');

            num = num1 + num2 + carry;

            if(2 <= num) {
                carry = 1;
                num -= 2;
            } else {
                carry = 0;
            }

            sb.append(num);
        }

        for(int i = 0; i < len2 - len1; i++) {
            num2 = (int) (bin2.charAt(len2 - len1 -1 - i ) - '0');

            num = num2 + carry;

            if(2 <= num) {
                carry = 1;
                num -= 2;
            } else {
                carry = 0;
            }

            sb.append(num);
        }
        
        if(0 < carry) {
            sb.append(1);
        }

        return sb.reverse().toString();
        */
        //*
        StringBuilder sb = new StringBuilder();
        int num1 = 0;
        int num2 = 0;
        int ans = 0;
        int val = 1;

        for(int i = bin1.length() - 1; 0 <= i; i--) {
            if(bin1.charAt(i) == '1') {
                num1 += val;
            }

            val *= 2;
        }

        val = 1;

        for(int i = bin2.length() - 1; 0 <= i; i--) {
            if(bin2.charAt(i) == '1') {
                num2 += val;
            }

            val *= 2;
        }

        ans = num1 + num2;

        if(ans == 0) {
            return "0";
        }

        while(ans != 0 ) {
            int r = ans % 2;
            ans /= 2;

            if(r == 1) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.reverse().toString();
        //*/
    }
}