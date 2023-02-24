class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(10 <= coupon) {
            chicken = coupon / 10;
            answer += chicken;
            coupon -= (chicken * 9);
        }
        
        return answer;
    }
}