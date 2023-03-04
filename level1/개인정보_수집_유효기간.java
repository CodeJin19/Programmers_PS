import java.util.*;

class Solution {
    public boolean isPast(String today, String targetDate, int d) {
        int todayY = 0;
        int todayM = 0;
        int todayD = 0;
        int targetY = 0;
        int targetM = 0;
        int targetD = 0;

        for(int i = 0; i < 4; i++) {
            todayY *= 10;
            todayY += (int)(today.charAt(i) - '0');

            targetY *= 10;
            targetY += (int)(targetDate.charAt(i) - '0');
        }

        for(int i = 5; i < 7; i++) {
            todayM *= 10;
            todayM += (int)(today.charAt(i) - '0');

            targetM *= 10;
            targetM += (int)(targetDate.charAt(i) - '0');
        }

        for(int i = 8; i < 10; i++) {
            todayD *= 10;
            todayD += (int)(today.charAt(i) - '0');

            targetD *= 10;
            targetD += (int)(targetDate.charAt(i) - '0');
        }
        
        targetM += d;

        targetY += (targetM / 12);
        targetM %= 12;

        if(targetD == 1) {
            targetM--;
            targetD = 28;
        } else {
            targetD--;
        }

        if(targetM == 0) {
            targetM = 12;
            targetY--;
        }

        if(targetY < todayY) {
            return true;
        } else if(targetY == todayY) {
            if(targetM < todayM) {
                return true;
            } else if(targetM == todayM) {
                if(targetD < todayD) {
                    return true;
                } else if(targetD == todayD) {
                    return false;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] months = new int[26];

        for(int i = 0; i < terms.length; i++) {
            int idx = (int)(terms[i].charAt(0) - 'A');
            int len = terms[i].length();
            months[idx] = 0;

            for(int j = 2; j < len; j++) {
                months[idx] *= 10;
                months[idx] += (int)(terms[i].charAt(j) - '0');
            }
        }

        for(int i = 0; i < privacies.length; i++) {
            int idx =  (int)(privacies[i].charAt(11) - 'A');
            if(isPast(today, privacies[i].substring(0, 10), months[idx])) {
                tmp.add(i + 1);
            }
        }

        int[] answer = new int[tmp.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}