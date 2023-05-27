class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int len = picture[0].length();
        
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < len; j++) {
                for(int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            
            for(int l = 0; l < k; l++) {
                answer[k * i + l] = sb.toString();
            }
        }
        
        return answer;
    }
}