import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int e = Integer.MAX_VALUE;
        int cnt = 0;

        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0]) {
                    return -1;
                } else if(o1[0] == o2[0]) {
                    if(o1[1] <= o2[1]) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else {
                    return 1;
                }
            }
        });

        for(int i = 0; i < targets.length; i++) {
            if(targets[i][0] < e) {
                e = Math.min(e, targets[i][1]);
            } else {
                cnt++;
                e = targets[i][1];
            }
        }

        return ++cnt;
    }
}