import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> idHashList = new HashMap<String, Integer>();
        boolean[][] reportGraph = new boolean[id_list.length][id_list.length];
        boolean[] bannedIdList = new boolean[id_list.length];

        for(int i = 0; i < id_list.length; i++) {
            idHashList.put(id_list[i], i);
        }

        for(int i = 0; i < report.length; i++) {
            StringTokenizer st = new StringTokenizer(report[i]);
            int from = idHashList.get(st.nextToken());
            int to = idHashList.get(st.nextToken());

            reportGraph[from][to] = true;
        }

        for(int i = 0; i < id_list.length; i++) {
            int cnt = 0;

            for(int j = 0; j < id_list.length; j++) {
                if(reportGraph[j][i]) {
                    cnt++;
                }

                if(k <= cnt) {
                    break;
                }
            }

            if(k <= cnt) {
                bannedIdList[i] = true;
            }
        }

        for(int i = 0; i < id_list.length; i++) {
            int cnt = 0;

            for(int j = 0; j < id_list.length; j++) {
                if(reportGraph[i][j] && bannedIdList[j]) {
                    cnt++;
                }
            }

            answer[i] = cnt;
        }

        return answer;
    }
}