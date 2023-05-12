class Solution {
    public int solution(int[] num_list) {
        int m = 1;
        int s = 0;
        double rm, ds;
        
        for(int i = 0; i < num_list.length; i++) {
            m *= num_list[i];
            s += num_list[i];
            
            rm = Math.sqrt(m);
            ds = s;
            
            if(ds < rm) {
                return 0;
            }
        }
        
        if(m < s * s) {
            return 1;
        } else {
            return 0;
        }
    }
}