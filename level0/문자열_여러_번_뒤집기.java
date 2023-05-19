class Solution {
    public String solution(String my_string, int[][] queries) {
        int len = my_string.length();
        char[] str = new char[len];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            str[i] = my_string.charAt(i);
        }
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            char[] tmp = new char[len];
            
            for(int j = 0; j < len; j++) {
                if(s <= j && j <= e) {
                    tmp[j] = str[s + e - j];
                } else {
                    tmp[j] = str[j];
                }
            }
            
            for(int j = 0; j < len; j++) {
                str[j] = tmp[j];
            }
        }
        
        for(int i = 0; i < len; i++) {
            sb.append(str[i]);
        }
        
        return sb.toString();
    }
}