class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            int[] tmp;
            
            if(i % 2 == 0) {
                int to = query[i];
                tmp = new int[to + 1];
                
                for(int j = 0; j <= to; j++) {
                    tmp[j] = arr[j];
                }
            } else {
                int from = query[i];
                tmp = new int[arr.length - from];
                
                for(int j = from; j < arr.length; j++) {
                    tmp[j - from] = arr[j];
                }
            }
            
            arr = tmp;
        }
        
        return arr;
    }
}