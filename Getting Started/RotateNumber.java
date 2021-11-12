import java.util.*;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int dig = 0;
        while (temp != 0) {
            temp = temp / 10;
            dig++;
        }
        k = k % dig;
        if (k < 0) {
            k = k + dig;
        }
        // System.out.println(dig);
        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, dig - k);
        int que = n / div;
        int rem = n % div;
        System.out.println(rem * mul + que);
        scn.close();
    }
}
