class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int[] score = new int[4];
        /*
        1번 지표	라이언형(R), 튜브형(T)
        2번 지표	콘형(C), 프로도형(F)
        3번 지표	제이지형(J), 무지형(M)
        4번 지표	어피치형(A), 네오형(N)
        */

        for(int i = 0; i < survey.length; i++) {
            choices[i] = choices[i] - 4;
            
            if("RT".equals(survey[i])) {
                score[0] += choices[i];
            } else if("TR".equals(survey[i])) {
                score[0] -= choices[i];
            } else if("CF".equals(survey[i])) {
                score[1] += choices[i];
            } else if("FC".equals(survey[i])) {
                score[1] -= choices[i];
            } else if("JM".equals(survey[i])) {
                score[2] += choices[i];
            } else if("MJ".equals(survey[i])) {
                score[2] -= choices[i];
            } else if("AN".equals(survey[i])) {
                score[3] += choices[i];
            } else if("NA".equals(survey[i])) {
                score[3] -= choices[i];
            }
        }
        
        if(score[0] <= 0) {
            sb.append("R");
        } else {
            sb.append("T");
        }
        
        if(score[1] <= 0) {
            sb.append("C");
        } else {
            sb.append("F");
        }
        
        if(score[2] <= 0) {
            sb.append("J");
        } else {
            sb.append("M");
        }

        if(score[3] <= 0) {
            sb.append("A");
        } else {
            sb.append("N");
        }
        
        return sb.toString();
    }
}