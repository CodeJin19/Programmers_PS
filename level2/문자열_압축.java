class Solution {
    public int zip(String s, int partLength) {
        StringBuilder zipped = new StringBuilder();
        StringBuilder tmp;
        String key, next;
        int len = s.length();
        int cnt;
        boolean isLeft = true;

        tmp = new StringBuilder();

        for(int i = 0; i < partLength; i++) {
            tmp.append(s.charAt(i));
        }

        key = tmp.toString();
        cnt = 1;

        for(int i = partLength; i < len;) {
            if(len - i < partLength) {
                if(cnt == 1) {
                    zipped.append(key);
                } else {
                    zipped.append(cnt).append(key);
                }

                for(;i < len; i++) {
                    zipped.append(s.charAt(i));
                }

                isLeft = false;
            } else {
                tmp = new StringBuilder();

                for(int j = 0; j < partLength; j++) {
                    tmp.append(s.charAt(i));
                    i++;
                }

                next = tmp.toString();

                if(key.compareTo(next) == 0) {
                    cnt++;
                } else {
                    if(cnt == 1) {
                        zipped.append(key);
                    } else {
                        zipped.append(cnt).append(key);
                    }
                    key = next;
                    cnt = 1;
                }
            }
        }

        if(isLeft) {
            if(cnt == 1) {
                zipped.append(key);
            } else {
                zipped.append(cnt).append(key);
            }
        }

        return zipped.toString().length();
    }

    public int solution(String s) {
        int len = s.length();
        int answer = len;

        for(int i = 1; i <= len / 2; i++) {
            answer = Math.min(answer, zip(s, i));
        }

        return answer;
    }
}