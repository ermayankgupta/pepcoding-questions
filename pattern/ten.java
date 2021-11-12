import java.util.*;

public class ten {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int onsp = n / 2;
        int insp = 0;
        scn.close();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n / 2; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            } else {
                for (int j = 1; j <= onsp; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = 1; j < insp; j++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                insp+=2;
                onsp--;
            }else{
                onsp++;
                insp-=2;
            }
        }
    }
}
