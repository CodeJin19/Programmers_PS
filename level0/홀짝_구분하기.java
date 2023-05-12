import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        if(n % 2 == 0) {
            sb.append(n).append(" is even");
        } else {
            sb.append(n).append(" is odd");
        }
        
        System.out.println(sb);
    }
}