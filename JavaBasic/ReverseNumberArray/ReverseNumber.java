import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strArr=in.nextLine().split("");

        for (int i=strArr.length-1;i>=0;i--){
            System.out.printf("%s",strArr[i]);


        }

    }
}
