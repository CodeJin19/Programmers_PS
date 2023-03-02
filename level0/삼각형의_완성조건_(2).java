class Solution {
    public int solution(int[] sides) {
        int answer = 1;

        if(sides[1] < sides[0]) {
            int tmp = sides[0];
            sides[0] = sides[1];
            sides[1] = tmp;
        }
        
        return 2 * (sides[0] - 1) + 1;
    }
}