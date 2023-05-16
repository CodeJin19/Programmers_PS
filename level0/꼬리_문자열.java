class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        int len = ex.length();
        
        for(int i = 0; i < str_list.length; i++) {
            int len1 = str_list[i].length();
            boolean add = true;
            
            for(int j = 0; j <= len1 - len; j++) {
                if(str_list[i].charAt(j) == ex.charAt(0)) {
                    boolean flag = true;
                    
                    for(int k = 0; k < len; k++) {
                        if(str_list[i].charAt(j + k) != ex.charAt(k)) {
                            flag = false;
                            break;
                        }
                    }
                    
                    if(flag) {
                        add = false;
                        break;
                    }
                }
            }
            
            if(add) {
                sb.append(str_list[i]);
                
            }
        }
        
        return sb.toString();
    }
}