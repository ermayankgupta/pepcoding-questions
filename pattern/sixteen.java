import java.util.*;

public class sixteen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(j+"\t");
            }
            for (int j = 1; j <=nsp; j++) {
                System.out.print("\t");
            }
            if(i==n){
                nst--;
            }
            for(int j=nst;j>=1;j--){
                System.out.print(j+"\t");
            }
            nsp-=2;
            nst++;
            System.out.println();
        }
        scn.close();
    }
}
