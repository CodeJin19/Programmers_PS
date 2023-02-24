class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int y = 0;
        int x = 0;
        int xMax = board[0] / 2;
        int xMin = 0 - xMax;
        int yMax = board[1] / 2;
        int yMin = 0 - yMax;
        
        for(int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i].charAt(0)) {
                case 'u':
                    y = y == yMax ? yMax : y + 1;
                    break;
                case 'd':
                    y = y == yMin ? yMin : y - 1;
                    break;
                case 'r':
                    x = x == xMax ? xMax : x + 1;
                    break;
                case 'l':
                    x = x == xMin ? xMin : x - 1;
                    break;
            }
        }
        
        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}