class Solution {
    public long solution(int price, int money, int count) {
        long answer = count * (count + 1) / 2;
        answer *= price;
        
        if(answer < money) {
            return (long) 0;
        } else {
            return answer - money;
        }
    }
}