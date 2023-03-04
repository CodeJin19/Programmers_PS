class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx = 0, idx1 = 0, idx2 = 0;
        boolean isPossible = true;

        while(idx < goal.length) {
            if(idx1 < cards1.length && cards1[idx1].equals(goal[idx])) {
                idx1++;
                idx++;
            } else if(idx2 < cards2.length && cards2[idx2].equals(goal[idx])) {
                idx2++;
                idx++;
            } else {
                isPossible = false;
                break;
            }
        }

        if(isPossible) {
            return "Yes";
        } else {
            return "No";
        }
    }
}