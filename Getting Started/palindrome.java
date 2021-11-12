import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int temp = n;
        int temp1=n;
        int reverse =0;
        int mul=1;
        while(temp>10){
            temp=temp/10;
            mul=mul*10;
        }
        while(temp1!=0){
            int rem =temp1%10;
            reverse = reverse + rem *mul;
            mul=mul/10;
            temp1=temp1/10;
        }
        if(n==reverse){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        scn.close();
    }
}
