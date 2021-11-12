import java.util.*;
public class InverseOfNumber {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int place = 1;
        int inverse=0;
        while(n>0){
            int que = n/10;
            int rem = n%10;
            inverse = inverse + place * (int)Math.pow(10,rem);
            n=que;
            place++;
        }
        System.out.println(inverse);
        scn.close();
    }
}
