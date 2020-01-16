//문자열_내_마음대로_정렬하기

import java.util.Arrays;

class Solution {
  public String[] solution(String[] strings, int n) {
      String[] answer = {};
      answer = new String[strings.length];
      String[] tmp;
      char[] chararr = new char[strings.length];
      int cnt, idx = 0, tmpIdx;
      
      for (int i = 0; i < strings.length; i++)
      {
          chararr[i] = strings[i].charAt(n);
      }
      
      Arrays.sort(chararr);
      
      for (int i = 0; i < chararr.length;)
      {
          cnt = 1;
          
          while(i + cnt < chararr.length && chararr[i] == chararr[i + cnt])
          {
              cnt++;
          }
          
          if(cnt == 1)
          {
              for(int j = 0; j < strings.length; j++)
              {
                  if(strings[j].charAt(n) == chararr[i])
                  {
                      answer[idx] = strings[j];
                      idx++;
                      break;
                  }
              }
          }
          else
          {
              tmp = new String[cnt];
              tmpIdx = 0;
              
              for(int j = 0; j < strings.length; j++)
              {
                  if(strings[j].charAt(n) == chararr[i])
                  {
                      tmp[tmpIdx] = strings[j];
                      tmpIdx++;
                  }
              }
              
              Arrays.sort(tmp);
              
              for(int j = 0; j < tmp.length; j++)
              {
                  answer[idx] = tmp[j];
                  idx++;
              }
          }
          
          i += cnt;
      }
      
      return answer;
  }
} ;  
