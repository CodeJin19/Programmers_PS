import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        LinkedList <Integer> list = new LinkedList<>();
        int listCnt = 0;

        answer[0] = score[0];
        list.addFirst(score[0]);
        listCnt++;

        for(int i = 1; i < score.length; i++) {
            int idx = 0;

            while(idx < listCnt && list.get(idx) < score[i]) {
                idx++;
            }
            
            list.add(idx, score[i]);
            listCnt++;

            if (k < listCnt) {
                list.pop();
                listCnt--;
            }

            answer[i] = list.getFirst();

        }

        return answer;
    }
}