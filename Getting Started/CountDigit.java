import java.util.*;
public class CountDigit {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int ans=0;
        while(n!=0){
            n=n/10;
            ans++;
        }
        System.out.println(ans);
        scn.close();
    }
}
