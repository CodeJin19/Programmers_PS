class Solution {
    public int[] func(int[] arr) {
        int[] tmp = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(50 <= arr[i] && arr[i] % 2 == 0) {
                tmp[i] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 == 1) {
                tmp[i] = arr[i] * 2 + 1;
            } else {
                tmp[i] = arr[i];
            }
        }
        
        return tmp;
    }
    
    public int solution(int[] arr) {
        boolean flag;
        int[] next;
        int cnt = 0;
        
        do{
            next = func(arr);
            cnt++;
            flag = false;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != next[i]) {
                    flag = true;
                    break;
                }
            }
            
            if(flag) {
               arr = next; 
            }
        }while(flag);
        
        return --cnt;
    }
}