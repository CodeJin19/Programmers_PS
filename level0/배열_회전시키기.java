class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.charAt(0) == 'l') {
            for(int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }

            answer[numbers.length - 1] = numbers[0];
        } else {
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }

            answer[0] = numbers[numbers.length - 1];
        }

        return answer;
    }
}