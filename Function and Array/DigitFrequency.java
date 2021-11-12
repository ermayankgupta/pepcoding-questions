import java.util.*;
public class DigitFrequency{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int ans = getFrequency(n,d);
        System.out.println(ans);
        scn.close();
    }
    public static int getFrequency(int n, int d){
        int count=0;
        while(n!=0){
            int rem = n%10;
            if(rem==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}