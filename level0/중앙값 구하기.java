import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        return array[len / 2];
    }
}