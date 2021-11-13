import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scn.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid input");
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                int val = 0;
                for (int k = 0; k < c1; k++) {
                    val += arr1[i][k] * arr2[k][j];
                }
                mul[i][j] = val;
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
