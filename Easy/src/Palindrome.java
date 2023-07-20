import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
