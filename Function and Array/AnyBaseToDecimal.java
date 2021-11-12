import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = getIntoDecimal(n,b);
        System.out.println(ans);
        scn.close();
    }
    public static int getIntoDecimal(int n,int b){
        int mul=1;
        int ans =0;
        while(n!=0){
            int rem = n%10;
            ans = ans+ rem*mul;
            mul=mul*b;
            n=n/10;
        }
        return ans;
    }
}
