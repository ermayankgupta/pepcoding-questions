import java.util.*;

public class solution {
    public static boolean isPalindrome(int x) {
            if (x < 0) 
                return false;
            int temp = x;
            int reverse = 0;
            while (x != 0) {
                reverse = reverse * 10 + (x % 10);
                x /= 10;
            }
            
            return temp == reverse;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = isPalindrome(n);
        if (ans) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scn.close();
    }
}