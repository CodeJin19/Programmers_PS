import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            Stack<Character> stck = new Stack<>();
            boolean escape = false;

            for(int j = i; j < len; j++) {
                if(s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
                    stck.push(s.charAt(j));
                } else if(s.charAt(j) == ')') {
                    if(0 < stck.size() && stck.peek() == '(') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                } else if(s.charAt(j) == '}') {
                    if(0 < stck.size() && stck.peek() == '{') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                } else if(s.charAt(j) == ']') {
                    if(0 < stck.size() && stck.peek() == '[') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                }
            }

            if(escape) {
                continue;
            }

            for(int j = 0; j < i; j++) {
                if(s.charAt(j) == '(' || s.charAt(j) == '{' || s.charAt(j) == '[') {
                    stck.push(s.charAt(j));
                } else if(s.charAt(j) == ')') {
                    if(0 < stck.size() && stck.peek() == '(') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                } else if(s.charAt(j) == '}') {
                    if(0 < stck.size() && stck.peek() == '{') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                } else if(s.charAt(j) == ']') {
                    if(0 < stck.size() && stck.peek() == '[') {
                        stck.pop();
                    } else {
                        escape = true;
                        break;
                    }
                }
            }

            if(escape || 0 < stck.size()) {
                continue;
            } else {
                answer++;
            }
        }

        return answer;
    }
}