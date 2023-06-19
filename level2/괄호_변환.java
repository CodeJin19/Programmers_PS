class Solution {
    public String separate(String p) {
        int len = p.length();

        if(len == 0) {
            return "";
        }

        int idx = 0;
        int cnt = 0;

        do{
            if(p.charAt(idx) == '(') {
                cnt++;
            } else {
                cnt--;
            }

            idx++;
        } while (cnt != 0);

        String u;
        String v;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < idx; i++) {
            sb.append(p.charAt(i));
        }

        u = sb.toString();

        sb = new StringBuilder();

        if(idx == len) {
            v = "";
        } else {
            for(int i = idx; i < len; i++) {
                sb.append(p.charAt(i));
            }

            v = sb.toString();
        }

        return transform(u, v);
    }

    public String transform(String u, String v) {
        int uLen = u.length();
        int cnt = 0;
        boolean flag = true;
        StringBuilder sb;

        for(int i = 0; i < uLen; i++) {
            if(u.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }

            if(cnt < 0) {
                flag = false;
                break;
            }
        }

        if(flag) {
            sb = new StringBuilder();
            sb.append(u);

            String tmp = separate(v);
            sb.append(tmp);
        } else {
            sb = new StringBuilder();
            sb.append('(');

            String tmp = separate(v);
            sb.append(tmp);

            sb.append(')');

            for(int i = 1; i < uLen -1 ; i++) {
                if(u.charAt(i) == '(') {
                    sb.append(')');
                } else {
                    sb.append('(');
                }
            }
        }

        return sb.toString();
    }
    
    public String solution(String p) {
        String ret;
        int len = p.length();
        int cnt = 0;
        int idx = 0;
        boolean flag = true;

        while(idx < len) {
            if(p.charAt(idx) == '(') {
                cnt++;
            } else {
                cnt--;
            }

            if(cnt < 0) {
                flag = false;
                break;
            }

            idx++;
        }

        if(flag) {
            ret = p;
        } else {
            ret = separate(p);
        }

        return ret;
    }
}