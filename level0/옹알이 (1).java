class Solution {

    boolean check(String word, int idx, int len) {
        if(len <= idx)
            return true;

        boolean ret = false;

        switch(word.charAt(idx)) {
            case 'a'://aya
                if(idx + 2 < len && word.charAt(idx + 1) == 'y' && word.charAt(idx + 2) == 'a') {
                    ret = check(word, idx + 3, len);
                }
                break;
            case 'y'://ye
                if(idx + 1 < len && word.charAt(idx + 1) == 'e') {
                    ret = check(word, idx + 2, len);
                }
                break;
            case 'w'://woo
                if(idx + 2 < len && word.charAt(idx + 1) == 'o' && word.charAt(idx + 2) == 'o') {
                    ret = check(word, idx + 3, len);
                }
                break;
            case 'm'://ma
                if(idx + 1 < len && word.charAt(idx + 1) == 'a') {
                    ret = check(word, idx + 2, len);
                }
                break;
            default:
                return false;
        }

        return ret;
    }

    public int solution(String[] babbling) {
        int cnt = 0;

        for(int i = 0; i < babbling.length; i++) {
            if(check(babbling[i], 0, babbling[i].length())) {
                cnt++;
            }
        }
        return cnt;
    }
}