class Solution {
    public boolean isThereThree(int num) {
        while(num != 0) {
            if(num % 10 == 3) {
                return true;
            } else {
                num /= 10;
            }
        }
        
        return false;
    }
    public int solution(int n) {
        int num = 1;
        
        for(int idx = 1 ; idx <= n; idx++) {
            while(num % 3 == 0 || isThereThree(num)) {
                num++;
            }
            
            num++;
        }
        
        return --num;
    }
}