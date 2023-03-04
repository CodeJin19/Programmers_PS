class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            num = 0;

            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                num = (int) (s.charAt(i) - '0');
            } else {
                switch (s.charAt(i)) {
                    case 'z':
                        num = 0;
                        i += 3;
                        break;
                    case 'o':
                        num = 1;
                        i += 2;
                        break;
                    case 't':
                        if(s.charAt(i + 1) == 'w') {
                            num = 2;
                            i += 2;
                        } else if(s.charAt(i + 1) == 'h') {
                            num = 3;
                            i += 4;
                        }
                        break;
                    case 'f':
                        if(s.charAt(i + 1) == 'o') {
                            num = 4;
                            i += 3;
                        } else if(s.charAt(i + 1) == 'i') {
                            num = 5;
                            i += 3;
                        }
                        break;
                    case 's':
                        if(s.charAt(i + 1) == 'i') {
                            num = 6;
                            i += 2;
                        } else if(s.charAt(i + 1) == 'e') {
                            num = 7;
                            i += 4;
                        }
                        break;
                    case 'e':
                        num = 8;
                        i += 4;
                        break;
                    case 'n':
                        num = 9;
                        i += 3;
                        break;
                }
            }

            answer *= 10;
            answer += num;
        }

        return answer;
    }
}