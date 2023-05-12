import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < len; i++) {
            char c = a.charAt(i);
            char newC;
            
            if('a' <= c && c <= 'z') {
                newC = (char) ('A' + (int)(c - 'a'));
            } else {
                newC = (char) ('a' + (int)(c - 'A'));
            }
            
            sb.append(newC);
        }
        
        System.out.println(sb);
    }
}