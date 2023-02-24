import java.util.ArrayList;

class Solution {
        public char translate(String word) {
        switch(word.length()) {
            case 1:
                if(".".compareTo(word) == 0) {
                    return 'e';
                } else if("-".compareTo(word) == 0) {
                    return 't';
                }
                break;
            case 2:
                if(".-".compareTo(word) == 0) {
                    return 'a';
                } else if("..".compareTo(word) == 0) {
                    return 'i';
                } else if("--".compareTo(word) == 0) {
                    return 'm';
                } else if("-.".compareTo(word) == 0) {
                    return 'n';
                }
                break;
            case 3:
                if("-..".compareTo(word) == 0) {
                    return 'd';
                } else if("--.".compareTo(word) == 0) {
                    return 'g';
                } else if("-.-".compareTo(word) == 0) {
                    return 'k';
                } else if("---".compareTo(word) == 0) {
                    return 'o';
                } else if(".-.".compareTo(word) == 0) {
                    return 'r';
                } else if("...".compareTo(word) == 0) {
                    return 's';
                } else if("..-".compareTo(word) == 0) {
                    return 'u';
                } else if(".--".compareTo(word) == 0) {
                    return 'w';
                }
                break;
            case 4:
                if("-...".compareTo(word) == 0) {
                    return 'b';
                } else if("-.-.".compareTo(word) == 0) {
                    return 'c';
                } else if("..-.".compareTo(word) == 0) {
                    return 'f';
                } else if("....".compareTo(word) == 0) {
                    return 'h';
                } else if(".---".compareTo(word) == 0) {
                    return 'j';
                } else if(".-..".compareTo(word) == 0) {
                    return 'l';
                } else if(".--.".compareTo(word) == 0) {
                    return 'p';
                } else if("--.-".compareTo(word) == 0) {
                    return 'q';
                } else if("...-".compareTo(word) == 0) {
                    return 'v';
                } else if("-..-".compareTo(word) == 0) {
                    return 'x';
                } else if("-.--".compareTo(word) == 0) {
                    return 'y';
                } else if("--..".compareTo(word) == 0) {
                    return 'z';
                }
                break;
        }

        return 'a';
    }
    
    public String solution(String letter) {
        ArrayList<String> list = new ArrayList<>();
        int len = letter.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < len; i++) {
            if(letter.charAt(i) == ' ') {
                list.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(letter.charAt(i));
            }
        }

        list.add(sb.toString());
        int size = list.size();
        sb = new StringBuilder();

        for(int i = 0; i < size; i++) {
            sb.append(translate(list.get(i)));
        }

        return sb.toString();
    }
}