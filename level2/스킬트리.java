class Solution {
    public int solution(String skill, String[] skill_trees) {
        int[] arr = new int[26];
        int answer = 0;
        int len, lv;
        boolean flag;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        len = skill.length();
        lv = 0;

        for(int i = 0; i < len; i++) {
            int idx = (int)(skill.charAt(i) - 'A');
            arr[idx] = lv++;
        }

        for(int i = 0; i < skill_trees.length; i++) {
            len = skill_trees[i].length();
            flag = true;
            lv = 0;

            for(int j = 0; j < len; j++) {
                int idx = (int)(skill_trees[i].charAt(j) - 'A');

                if(0 <= arr[idx]) {
                    if(arr[idx] == lv) {
                        lv++;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag) {
                System.out.println(skill_trees[i]);
                answer++;
            }
        }

        return answer;
    }
}