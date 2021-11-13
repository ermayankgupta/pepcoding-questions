import java.util.*;
public class exitPointOfMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int i=0;
        int j=0;
        int dir=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){
                j++;
                if(j==c){
                    j--;
                    break;
                }
            }else if(dir==1){
                i++;
                if(i==r){
                    i--;
                    break;
                }
            }else if(dir==2){
                j--;
                if(j==-1){
                    j++;
                    break;
                }
            }else{
                i--;
                if(i==-1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(i);
        System.out.println(j);
        scn.close();
    }
}
