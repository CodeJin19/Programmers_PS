class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int len = numbers.length();

        for(int i = 0; i < len; i++) {
            switch(numbers.charAt(i)) {
                case 'z': //zero
                    answer *= (long) 10;
                    answer += (long) 0;
                    i += 3;
                    break;
                case 'o' : //one
                    answer *= (long) 10;
                    answer += (long) 1;
                    i += 2;
                    break;
                case 't' : //two, three
                    if(numbers.charAt(i + 1) == 'w') {
                        answer *= (long) 10;
                        answer += (long) 2;
                        i += 2;    
                    } else {
                        answer *= (long) 10;
                        answer += (long) 3;
                        i += 4;
                    }
                    break;
                case 'f' : //four, five
                    if(numbers.charAt(i + 1) == 'o') {
                        answer *= (long) 10;
                        answer += (long) 4;
                        i += 3;    
                    } else {
                        answer *= (long) 10;
                        answer += (long) 5;
                        i += 3;
                    }
                    break;
                case 's' : //six, seven
                    if (numbers.charAt(i + 1) == 'i') {
                        answer *= (long) 10;
                        answer += (long) 6;
                        i += 2;
                    } else {
                        answer *= (long) 10;
                        answer += (long) 7;
                        i += 4;
                    }
                    break;
                case 'e' : //eight
                    answer *= (long) 10;
                    answer += (long) 8;
                    i += 4;
                    break;
                case 'n' : //nine
                    answer *= (long) 10;
                    answer += (long) 9;
                    i += 3;
                    break;
            }
        }
        return answer;
    }
}