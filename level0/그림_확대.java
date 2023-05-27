class Solution {
    public int[][] solution(int[][] arr) {
        int len1 = arr.length;
        int len2 = arr[0].length;
        int[][] answer;
        
        if(len1 < len2) {
            answer = new int[len2][len2];
            
            for(int i = 0; i < len1; i++) {
                for(int j = 0; j < len2; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            
            for(int i = len1; i < len2; i++) {
                for(int j = 0; j < len2; j++) {
                    answer[i][j] = 0;
                }
            }
        } else if (len2 < len1) {
            answer = new int[len1][len1];
            
            for(int i = 0; i < len1; i++) {
                for(int j = 0; j < len2; j++) {
                    answer[i][j] = arr[i][j];
                }
                
                for(int j = len2; j < len1; j++) {
                    answer[i][j] = 0;
                }
            }
        } else {
            answer = arr;
        }
        
        return answer;
    }
}