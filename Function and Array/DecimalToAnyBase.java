import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = getValueInBase(n,b);
        System.out.println(ans);
        scn.close();
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
