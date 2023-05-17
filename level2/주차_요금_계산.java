import java.util.*;

class Solution {
    int timeConverter(String str) {
        int h = 0;
        int m = 0;
        int ret = 0;

        for(int i = 0; i < 2; i++) {
            h *= 10;
            h += (int) (str.charAt(i) - '0');
        }

        for(int i = 3; i < 5; i++) {
            m *= 10;
            m += (int) (str.charAt(i) - '0');
        }

        ret = h * 60 + m;

        return ret;
    }

    public int[] solution(int[] fees, String[] records) {
        HashMap<String, Integer> carLog = new HashMap<>();
        HashMap<String, Integer> carTotalTime = new HashMap<>();
        StringTokenizer st;
        String tmp, car;
        String[] carList;
        int[] answer;
        int timeStamp, entryTime, time, idx;

        for(int i = 0; i < records.length; i++) {
            st = new StringTokenizer(records[i]);

            tmp = st.nextToken();
            timeStamp = timeConverter(tmp);

            car = st.nextToken();

            if(carLog.containsKey(car)) {
                if(carLog.get(car) == -1) { //입차
                    carLog.put(car, timeStamp);
                } else { //출차
                    entryTime = carLog.get(car);

                    if(carTotalTime.containsKey(car)) {
                        time = timeStamp - entryTime + carTotalTime.get(car);
                        carTotalTime.put(car, time);
                    } else {
                        carTotalTime.put(car, timeStamp - entryTime);
                    }

                    carLog.put(car, -1);
                }
            } else { //최초 입차
                carLog.put(car, timeStamp);
            }
        }

        for(String key : carLog.keySet()) {
            if(carTotalTime.containsKey(key)) {
                if(carLog.get(key) != -1) {
                    entryTime = carLog.get(key);
                    timeStamp = timeConverter("23:59");
                    time = timeStamp - entryTime + carTotalTime.get(key);
                    carTotalTime.put(key, time);
                }
            } else {
                if(carLog.get(key) != -1) {
                    entryTime = carLog.get(key);
                    timeStamp = timeConverter("23:59");
                    time = timeStamp - entryTime;
                    carTotalTime.put(key, time);
                }
            }
        }

        answer = new int[carTotalTime.size()];
        carList = new String[carTotalTime.size()];
        idx = 0;

        for(String key : carTotalTime.keySet()) {
            carList[idx++] = key;
        }

        Arrays.sort(carList);

        for(int i = 0; i < carList.length; i++) {
            time = carTotalTime.get(carList[i]);

            answer[i] = fees[1];

            if(fees[0] < time) {
                int x = time - fees[0];
                int r = x % fees[2];
                x /= fees[2];

                if(0 < r) {
                    x++;
                }

                answer[i] += (x * fees[3]);
            }
        }

        return answer;
    }
}