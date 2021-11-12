    import java.util.*;

    public class fifteen {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int nst=1;
            int nsp=n/2;
            int val=1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=nsp;j++){
                    System.out.print("\t");
                }
                int ival=val;
                for(int j=1;j<=nst;j++){
                    System.out.print(ival+"\t");
                    if(j<=nst/2){
                        ival++;
                    }else{
                        ival--;
                    }
                }
                System.out.println();
                if(i<=n/2){
                    nsp--;
                    nst+=2;
                    val++;
                }else{
                    nsp++;
                    nst-=2;
                    val--;
                }
            }
            scn.close();
        }
    }