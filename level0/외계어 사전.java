class Solution {
    public int solution(String[] spell, String[] dic) {
        int len;
        int[] cnt;        
        char[] arr = new char[spell.length];
        boolean flag;

        for(int i = 0; i < spell.length; i++) {
            arr[i] = spell[i].charAt(0);
        }

        for(int i = 0; i < dic.length; i++) {
            len = dic[i].length();
            
            if(len != spell.length) {
                continue;
            }
            
            cnt = new int[spell.length];

            for(int j = 0; j < len; j++) {
                for(int k = 0; k < arr.length; k++) {
                    if(arr[k] == dic[i].charAt(j)) {
                        cnt[k]++;

                        if(1 < cnt[k]) {
                            j = spell.length;
                        }

                        break;
                    }
                }
            }

            flag = true;

            for(int j = 0; j < cnt.length; j++) {
                if(cnt[j] != 1) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                return 1;
            }
        }

        return 2;
    }
}