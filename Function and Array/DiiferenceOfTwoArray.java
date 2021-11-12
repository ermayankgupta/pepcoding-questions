import java.util.*;

public class DiiferenceOfTwoArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }
        int[] diff = new int[n2];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        int c = 0;
        while (j >= 0) {
            int d = a2[j] - c;
            if (i >= 0) {
                d = d - a1[i];
            }
            if (d < 0) {
                d = d + 10;
                c = 1;
            } else {
                c = 0;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        for (int x = 0; x < diff.length; x++) {
            if (diff[x] != 0) {
                idx = x;
                break;
            }
        }
        for (int g = idx; g < diff.length; g++) {
            System.out.println(diff[g]);
        }
        scn.close();
    }

}