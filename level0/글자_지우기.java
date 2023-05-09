class Solution {
    public String solution(String my_string, int[] indices) {
        int len = my_string.length();
        boolean[] flag = new boolean[len];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            flag[i] = true;
        }
        
        for(int i = 0; i < indices.length; i++) {
            flag[indices[i]] = false;
        }
        
        for(int i = 0; i < len; i++) {
            if(flag[i]) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}