class Solution {
    public String solution(String new_id) {
        int len = new_id.length();
        StringBuilder tmpSB = new StringBuilder();
        String tmpS = new_id;

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        for(int i = 0; i < len; i++) {
            if('A' <= tmpS.charAt(i) && tmpS.charAt(i) <= 'Z') {
                char c = (char)('a' + (int)(tmpS.charAt(i) - 'A'));
                tmpSB.append(c);
            } else {
                tmpSB.append(tmpS.charAt(i));
            }
        }

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();
        tmpSB = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if('a' <= tmpS.charAt(i) && tmpS.charAt(i) <= 'z') {
                tmpSB.append(tmpS.charAt(i));
            } else if('0' <= tmpS.charAt(i) && tmpS.charAt(i) <= '9') {
                tmpSB.append(tmpS.charAt(i));
            } else if(tmpS.charAt(i) == '-' || tmpS.charAt(i) == '_' || tmpS.charAt(i) == '.') {
                tmpSB.append(tmpS.charAt(i));
            }
        }

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();
        tmpSB = new StringBuilder();
        boolean flag = false;

        for(int i = 0; i < len; i++) {
            if(flag) {
                if(tmpS.charAt(i) != '.') {
                    tmpSB.append(tmpS.charAt(i));
                    flag = false;
                }
            } else{
                tmpSB.append(tmpS.charAt(i));

                if(tmpS.charAt(i) == '.'){
                    flag = true;
                }
            }
        }

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();
        tmpSB = new StringBuilder();
        int idx = 0;

        len--;
        while(0 <= len && tmpS.charAt(len) == '.') {
            len--;
        }
        len++;

        while(idx < len && tmpS.charAt(idx) == '.') {
            idx++;
        }

        while(idx < len) {
            tmpSB.append(tmpS.charAt(idx++));
        }

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();

        if(len == 0) {
            tmpSB = new StringBuilder();
            tmpSB.append("a");
        }

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();

        if(16 <= len) {
            tmpSB = new StringBuilder();
            len = 14;
            while(0 <= len && tmpS.charAt(len) == '.') {
                len--;
            }
            len++;

            for(int i = 0; i < len; i++) {
                tmpSB.append(tmpS.charAt(i));
            }
        }

        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        tmpS = tmpSB.toString();
        len = tmpS.length();

        if(len == 1) {
            tmpSB.append(tmpS.charAt(0));
            tmpSB.append(tmpS.charAt(0));
        } else if(len == 2) {
            tmpSB.append(tmpS.charAt(1));

        }

        return tmpSB.toString();
    }
}