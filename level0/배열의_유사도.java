class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i].compareTo(s2[j]) == 0) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}