class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int ly = 0;
        int lx = 0;
        int ry = 0;
        int rx = 2;
        int lLength, rLength;

        for(int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                    lx = 0;
                    ly = 3;
                    answer.append("L");
                    break;
                case 4:
                    lx = 0;
                    ly = 2;
                    answer.append("L");
                    break;
                case 7:
                    lx = 0;
                    ly = 1;
                    answer.append("L");
                    break;
                case 3:
                    rx = 2;
                    ry = 3;
                    answer.append("R");
                    break;
                case 6:
                    rx = 2;
                    ry = 2;
                    answer.append("R");
                    break;
                case 9:
                    rx = 2;
                    ry = 1;
                    answer.append("R");
                    break;
                case 2:
                    lLength = Math.abs(3 - ly) + Math.abs(1 - lx);
                    rLength = Math.abs(3 - ry) + Math.abs(1 - rx);

                    if(lLength < rLength) {
                        ly = 3;
                        lx = 1;
                        answer.append("L");
                    } else if(rLength < lLength) {
                        ry = 3;
                        rx = 1;
                        answer.append("R");
                    } else if(hand.charAt(0) == 'l'){
                        ly = 3;
                        lx = 1;
                        answer.append("L");
                    } else if(hand.charAt(0) == 'r') {
                        ry = 3;
                        rx = 1;
                        answer.append("R");
                    }
                    break;
                case 5:
                    lLength = Math.abs(2 - ly) + Math.abs(1 - lx);
                    rLength = Math.abs(2 - ry) + Math.abs(1 - rx);

                    if(lLength < rLength) {
                        ly = 2;
                        lx = 1;
                        answer.append("L");
                    } else if(rLength < lLength) {
                        ry = 2;
                        rx = 1;
                        answer.append("R");
                    } else if(hand.charAt(0) == 'l'){
                        ly = 2;
                        lx = 1;
                        answer.append("L");
                    } else if(hand.charAt(0) == 'r') {
                        ry = 2;
                        rx = 1;
                        answer.append("R");
                    }
                    break;
                case 8:
                    lLength = Math.abs(1 - ly) + Math.abs(1 - lx);
                    rLength = Math.abs(1 - ry) + Math.abs(1 - rx);

                    if(lLength < rLength) {
                        ly = 1;
                        lx = 1;
                        answer.append("L");
                    } else if(rLength < lLength) {
                        ry = 1;
                        rx = 1;
                        answer.append("R");
                    } else if(hand.charAt(0) == 'l'){
                        ly = 1;
                        lx = 1;
                        answer.append("L");
                    } else if(hand.charAt(0) == 'r') {
                        ry = 1;
                        rx = 1;
                        answer.append("R");
                    }
                    break;
                case 0:
                    lLength = Math.abs(0 - ly) + Math.abs(1 - lx);
                    rLength = Math.abs(0 - ry) + Math.abs(1 - rx);

                    if(lLength < rLength) {
                        ly = 0;
                        lx = 1;
                        answer.append("L");
                    } else if(rLength < lLength) {
                        ry = 0;
                        rx = 1;
                        answer.append("R");
                    } else if(hand.charAt(0) == 'l'){
                        ly = 0;
                        lx = 1;
                        answer.append("L");
                    } else if(hand.charAt(0) == 'r') {
                        ry = 0;
                        rx = 1;
                        answer.append("R");
                    }
                    break;
            }
        }

        return answer.toString();
    }
}