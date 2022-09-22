import java.util.Scanner;

public class MatrixNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int lines,columns;
        for (columns=1; columns<=n; columns++){
            System.out.print(columns+" ");

            for (lines = columns+1; lines< columns+n;lines++){
                System.out.print(lines +" ");}

                System.out.println();
            }

        }
    }

