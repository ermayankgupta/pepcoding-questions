import java.util.*;

public class subsetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set ="";
            int temp=i;
            for (int j = arr.length-1; j >= 0; --j) {
                int rem = temp%2;
                temp=temp/2;
                if(rem==0){
                    set = "-    " + set;
                }else{
                    set = arr[j] + "    " + set;
                }
            }
            System.out.println(set);
        }
    }
}