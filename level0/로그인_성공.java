class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i < db.length; i++) {
            if(id_pw[0].compareTo(db[i][0]) == 0) {
                if(id_pw[1].compareTo(db[i][1]) == 0) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}