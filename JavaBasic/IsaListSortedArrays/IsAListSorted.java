import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class IsAListSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());


            for (int i = 0; i < N; i++) {
            String[] strArr = in.nextLine().split(",");
            boolean isSorted=true;


            for (int j = 0; j < strArr.length-1; j++) {

                if (Integer.parseInt(strArr[j])>Integer.parseInt(strArr[j+1])) {
                 isSorted=false;
                 break;


                }

            }

                System.out.println(isSorted);
            }

        }}






