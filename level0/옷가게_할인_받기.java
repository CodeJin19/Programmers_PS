class Solution {
    public int solution(int price) {
        if(500000 <= price)
            return price * 4 / 5;
        else if(300000 <= price)
            return price * 9 / 10;
        else if(100000 <= price)
            return price * 19 / 20;
        else
            return price;
    }
}