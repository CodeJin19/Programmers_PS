class Solution {
    int getCase(int a, int b, int c, int d) {
        int[] cnt = new int[7];        
        int max = 0;
        int min = 7;
        
        cnt[a]++;
        cnt[b]++;
        cnt[c]++;
        cnt[d]++;
        
        for(int i = 1; i < 7; i++) {
            max = max < cnt[i] ? cnt[i] : max;
            
            if(cnt[i] == 1 && i < min) {
                min = i;
            }
        }
        
        if(max == 4) {
            for(int i = 1; i < 7; i++) {
                if(cnt[i] == max) {
                    return i * 1111;
                }
            }
        } else if(max == 3) {
            int p = 0;
            int q = 0;
            
            for(int i = 1; i < 7; i++) {
                if(cnt[i] == max) {
                    p = i;
                } else if(cnt[i] == 1) {
                    q = i;
                }
            }
            
            return (10 * p + q ) * (10 * p + q);
        } else if(max == 2) {
            int p = 0;
            int q = 0;
            int r = 0;
            
            for(int i = 1; i < 7; i++) {
                if(cnt[i] == 2 && p == 0) {
                    p = i;
                }
                if(cnt[i] == 1 && r == 0) {
                    r = i;
                }
            }
            
            if(r == 0) {
                for(int i = 1; i < 7; i++) {
                    if(cnt[i] == 2 && i != p) {
                        q = i;
                        break;
                    }
                }
                
                return (p + q) * Math.abs(p - q);
            } else {
                for(int i = 1; i < 7; i++) {
                    if(cnt[i] == 1 && i != r) {
                        q = i;
                        break;
                    }
                }
                
                return q * r;
            }
        } else {
            return min;
        }
        
        return -1;
    }
    
    public int solution(int a, int b, int c, int d) {
        return getCase(a, b, c, d);
    }
}