class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        final int AYA = 0;
        final int YE = 1;
        final int WOO = 2;
        final int MA = 3;

        for(int i = 0; i < babbling.length; i++) {
            int len = babbling[i].length();
            int before = -1;
            boolean flag = true;

            for(int j = 0; j < len; j++) { // "aya", "ye", "woo", "ma"
                if(babbling[i].charAt(j) == 'a') {
                    if(j + 2 < len && babbling[i].charAt(j + 1) == 'y' && babbling[i].charAt(j + 2) == 'a') {
                        if(before == AYA) {
                            flag = false;
                            break;
                        } else {
                            j += 2;
                            before = AYA;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else if(babbling[i].charAt(j) == 'y') {
                    if(j + 1 < len && babbling[i].charAt(j + 1) == 'e') {
                        if(before == YE) {
                            flag = false;
                            break;
                        } else {
                            j += 1;
                            before = YE;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else if(babbling[i].charAt(j) == 'w') {
                    if(j + 2 < len && babbling[i].charAt(j + 1) == 'o' && babbling[i].charAt(j + 2) == 'o') {
                        if(before == WOO) {
                            flag = false;
                            break;
                        } else {
                            j += 2;
                            before = WOO;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else if(babbling[i].charAt(j) == 'm') {
                    if(j + 1 < len && babbling[i].charAt(j + 1) == 'a') {
                        if(before == MA) {
                            flag = false;
                            break;
                        } else {
                            j += 1;
                            before = MA;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            
            if(flag) {
                answer++;
            }
        }

        return answer;
    }
}