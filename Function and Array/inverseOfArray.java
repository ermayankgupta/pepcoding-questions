import java.io.*;

public class inverseOfArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }
    public static int[] inverse(int[] a) {
        int size = a.length;
        int [] b =new int[size];
        for(int i=0;i<size;i++){
            int val =a[i];
            b[val]=i;
        }
        return b;
    }
    public static void display(int[] b) {
        StringBuilder sb = new StringBuilder();

        for (int val : b) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
}