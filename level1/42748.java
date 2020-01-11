//K번째수

import java.io.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int l;
        
        for(int i = 0; i < commands.length; i++)
        {
            l = commands[i][1];
            l -= commands[i][0];
            l++;
            
            int[] tmp = new int[l];
            
            for(int j = 0; j < l ;j++)
            {
                tmp[j] = array[commands[i][0] - 1 + j];
            }

            Arrays.sort(tmp);
            
            answer[i] = tmp[commands[i][2] - 1];
        }
        
        return answer;
    }
}
