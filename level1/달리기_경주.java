import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hash = new HashMap<>();

        for(int i = 0; i < players.length; i++) {
            hash.put(players[i], i);
        }


        for(int i = 0; i < callings.length; i++) {
            String behind = callings[i];
            int behindIdx = hash.get(behind);

            int frontIdx = behindIdx - 1;
            String front = players[frontIdx];

            players[frontIdx] = behind;
            players[behindIdx] = front;

            hash.put(behind, frontIdx);
            hash.put(front, behindIdx);
        }

        return players;
    }
}
