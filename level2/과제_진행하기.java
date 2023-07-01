import java.util.*;

class Solution {
    class Assignment{
        String subject;
        int st;
        int timeLeft;

        Assignment(String subject, int st, int timeLeft) {
            this.subject =subject;
            this.st = st;
            this.timeLeft = timeLeft;
        }
    }


    public int timeStamp (String time) {
        int h = (int)(time.charAt(0) - '0') * 10 + (int)(time.charAt(1) - '0');
        int m = (int)(time.charAt(3) - '0') * 10 + (int)(time.charAt(4) - '0');
        int ret = h * 60 + m;
        return ret;
    }

    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        Assignment[] list = new Assignment[plans.length];
        Stack<Assignment> stck = new Stack<>();

        for(int i = 0; i < plans.length; i++) {
            Assignment newAssignment = new Assignment(plans[i][0], timeStamp(plans[i][1]), Integer.parseInt(plans[i][2]));
            list[i] = newAssignment;
        }

        Arrays.sort(list, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment o1, Assignment o2) {
                return o1.st - o2.st;
            }
        });

        stck.push(list[0]);
        int time = list[0].st;
        int idx = 1;
        int ansIdx = 0;
        
        while(!stck.isEmpty()) {
            if(idx < list.length) {
                while(!stck.isEmpty() && time + stck.peek().timeLeft <= list[idx].st) {
                    answer[ansIdx++] = stck.peek().subject;
                    time += stck.peek().timeLeft;
                    stck.pop();
                }

                if(!stck.isEmpty()) {
                    stck.peek().timeLeft -= (list[idx].st - time);
                    time = list[idx].st;
                    stck.push(list[idx++]);
                } else {
                    time = list[idx].st;
                    stck.push(list[idx++]);
                }
            } else {
                while(!stck.isEmpty()) {
                    answer[ansIdx++] = stck.peek().subject;
                    stck.pop();
                }
            }
        }

        return answer;
    }
}