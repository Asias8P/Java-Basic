import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = Double.parseDouble(in.nextLine());
        double num2 = Double.parseDouble(in.nextLine());
        double num3 = Double.parseDouble(in.nextLine());
        double multiplication = num1*num2*num3;
        if (multiplication>0){
            System.out.println("+");
        }
        else if(multiplication<0){
            System.out.println("-");
        }
        else {
            System.out.println("0");
        }
    }
}
