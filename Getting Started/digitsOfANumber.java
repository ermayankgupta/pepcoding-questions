import java.util.*;
public class digitsOfANumber {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int tempn = n;
        int dig=1;
        while(tempn>10){
            tempn=tempn/10;
            dig=dig*10;
        }
        // System.out.println(dig);
        while(dig>0){
            int que = n/dig;
            System.out.println(que);
            n = n%dig;
            dig=dig/10;
        }
        scn.close();
    }
}
