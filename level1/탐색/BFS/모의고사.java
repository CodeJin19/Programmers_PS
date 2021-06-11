//모의고사

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] arr = {0, 0, 0};
        int cnt = 0, max = 0;
        
        for (int i = 0; i < answers.length; i++)
        {
            if (first[i % 5] == answers[i])
            {
                cnt++;
            }
        }
        
        if (max < cnt)
        {
            max = cnt;
        }
        
        arr[0] = cnt;
        cnt = 0;
        
        for (int i = 0; i < answers.length; i++)
        {
            if (second[i % 8] == answers[i])
            {
                cnt++;
            }
        }
        
        if (max < cnt)
        {
            max = cnt;
        }
        
        arr[1] = cnt;
        cnt = 0;
        
        for (int i = 0; i < answers.length; i++)
        {
            if (third[i % 10] == answers[i])
            {
                cnt++;
            }
        }
        
        if (max < cnt)
        {
            max = cnt;
        }
        
        arr[2] = cnt;
        cnt = 0;
        
        for(int i = 0; i < 3; i++)
        {
            if (arr[i] == max)
            {
                cnt++;
            }
        }
        
        int tmp[] = new int[cnt];
        cnt = 0;
        
        for(int i = 0; i < 3; i++)
        {
            if(arr[i] == max)
            {
                tmp[cnt] = i + 1;
                cnt++;
            }
        }
        
        answer = tmp;
        return answer;
    }
}
