import java.util.*;
public class FindElementInTheArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        boolean ans = true;
        int dig=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                ans =true;
                dig=i;
                break;
            }else{
                ans=false;
            }
        }
        if(ans){
            System.out.println(dig);
        }else{
            System.out.println("-1");
        }
        scn.close();
    }
}
