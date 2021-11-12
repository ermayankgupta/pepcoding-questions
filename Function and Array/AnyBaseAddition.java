import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = addition(n1,n2,b);
        System.out.println(ans);
        scn.close();
    }
    public static int addition(int n1,int n2,int b){
        int c=0;
        int mul=1;
        int ans=0;
        while(n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            int d = d1+d2+c;
            c=d/b;
            d=d%b;
            ans = ans +d*mul;
            mul*=10;
        }
        return ans;
    }
}
