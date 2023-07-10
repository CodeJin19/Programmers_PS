import java.util.*;

class Solution {
    public int timeStamp(String str) {
        int h = ((int)(str.charAt(0) - '0')) * 10 + ((int)(str.charAt(1) - '0'));
        int m = ((int)(str.charAt(3) - '0')) * 10 + ((int)(str.charAt(4) - '0'));
        int ret = h * 60 + m;
        return ret;
    }
    
    public int solution(String[][] book_time) {
        int[][] arr = new int[book_time.length][2];
        int cnt = 0;
        ArrayList<Integer> rooms = new ArrayList<>();

        for(int i = 0; i < book_time.length; i++) {
            arr[i][0] = timeStamp(book_time[i][0]);
            arr[i][1] = timeStamp(book_time[i][1]) + 10; //청소시간
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i = 0; i < arr.length; i++) {
            int idx = -1;
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < cnt; j++) {
                if(rooms.get(j) <= arr[i][0]) {
                    if(arr[i][0] - rooms.get(j) < min) {
                        min = arr[i][0] - rooms.get(j);
                        idx = j;
                    }
                }
            }

            if(0 <= idx) {
                rooms.set(idx, arr[i][1]);
            } else {
                rooms.add(arr[i][1]);
                cnt++;
            }
        }

        return cnt;
        /*
        int[][] arr = new int[book_time.length][2];
        int cnt = 0;
        ArrayList<Integer> rooms = new ArrayList<>();
        boolean addNewRoom, flag;

        for(int i = 0; i < book_time.length; i++) {
            arr[i][0] = timeStamp(book_time[i][0]);
            arr[i][1] = timeStamp(book_time[i][1]) + 10; //청소시간
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i = 0; i < arr.length; i++) {
            addNewRoom = true;

            for(int j = 0; j < cnt; j++) {
                if(rooms.get(j) <= arr[i][0]) {
                    rooms.set(j, arr[i][1]);
                    addNewRoom = false;
                    break;
                }
            }

            if(addNewRoom) {
                rooms.add(arr[i][1]);
                cnt++;
            }
        }

        return cnt;
        */
    }
}