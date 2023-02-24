import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> ansArr = new ArrayList<>();
        boolean[] isPrime = new boolean [n + 1];
        
        for(int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for(int i = 2; i <= n; i++) {
            if(!isPrime[i]) {
                continue;
            }
            
            for(int j = i + i; j <= n;) {
                isPrime[j] = false;
                j += i;
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(n == 1) {
                break;
            }
            
            if(isPrime[i] && n % i == 0) {
                ansArr.add(i);
                
                while(n % i == 0) {
                    n /= i;
                }
            }
        }
        
        int cnt = ansArr.size();
        int[] answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++) {
            answer[i] = ansArr.get(i);
        }
        
        return answer;
    }
}