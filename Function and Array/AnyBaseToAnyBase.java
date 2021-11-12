import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int decimal = getIntoDecimal(n, sourceBase);
        int ans = getValueInBase(decimal, destBase);
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
    public static int getValueInBase(int n,int b){
        int mul=1;
        int ans=0;
        while(n!=0){
            int rem = n%b;
            ans=ans+rem*mul;
            mul=mul*10;
            n=n/b;
        }
        return ans;
    }
}