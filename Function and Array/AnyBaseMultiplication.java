import java.util.*;
public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int dn1 = getIntoDecimal(n1, b);
        int dn2 = getIntoDecimal(n2, b);
        int a =dn1*dn2;
        int ans = getValueInBase(a, b);
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
