import java.util.*;
public class palindromeleet {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int temp1=x;
        int reverse =0;
        int mul=1;
        boolean answer;
        while(temp>10){
            temp=temp/10;
            mul=mul*10;
        }
        System.out.println(mul);
        while(temp1!=0){
            int rem =temp1%10;
            reverse = reverse + rem *mul;
            mul=mul/10;
            temp1=temp1/10;
        }
        
        if(x==reverse){
            answer = true;
        }else{
            answer =false;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // boolean ans = isPalindrome(n);
        if(isPalindrome(n)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        scn.close();
    }
}
