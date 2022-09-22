import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class from1toN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int i =0;
        int next =0;
        for ( i=1;i<=N;i++){
            i = Integer.parseInt(in.nextLine());}


        for (i=1;i<=N;i++){
            for(int k=2;k<=N;k++)
        if (i>k){
            System.out.printf("%d>%d",i,k);
        }
        else if  (i<k){
            System.out.printf("%d<%d",i,k);
        }

    }}}

