class Solution {
    public int solution(int[] dot) {
        if(0 < dot[0]) {
            if(0 < dot[1]) {
                return 1;
            } else {
                return 4;
            }   
        } else {
            if(0 < dot[1]) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}