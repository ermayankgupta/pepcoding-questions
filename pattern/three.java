import java.util.*;
public class three {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }
        scn.close();
    }
}
