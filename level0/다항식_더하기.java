class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int len = polynomial.length();
        int co = 0;
        int num = 0;
        int tmp = 0;

        for(int i = 0; i < len; i++) {
            if(polynomial.charAt(i) == ' ') {

            } else if(polynomial.charAt(i) == 'x') {
                if(i == 0 || (0 < i && polynomial.charAt(i - 1) == ' ')) {
                    sb.append("1x");
                } else {
                    sb.append("x");
                }
            } else {
                sb.append(polynomial.charAt(i));
            }
        }

        polynomial = sb.toString();
        len = polynomial.length();

        for(int i = 0;i < len; i++) {
            if('0' <= polynomial.charAt(i) && polynomial.charAt(i) <= '9') {
                while(i < len && '0' <= polynomial.charAt(i) && polynomial.charAt(i) <= '9') {
                    tmp *= 10;
                    tmp += (int)(polynomial.charAt(i) - '0');
                    i++;
                }

                i--;
            } else if(polynomial.charAt(i) == 'x'){
                co += tmp;
                tmp = 0;
            } else if(polynomial.charAt(i) == '+'){
                num += tmp;
                tmp = 0;
            }
        }

        num += tmp;
        
        sb = new StringBuilder();
        
        if(co == 0) {
            if(num == 0) {
                sb.append("");
            } else {
                sb.append(num);
            }
        } else {
            if(co == 1) {
                sb.append("x");
            } else {
                sb.append(co).append("x");
            }
            
            if(num != 0) {
                sb.append(" + ").append(num);
            }
        }
        
        return sb.toString();
    }
}