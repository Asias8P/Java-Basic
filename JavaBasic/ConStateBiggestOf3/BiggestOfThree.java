import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = Integer.parseInt(in.nextLine());
        int number2 = Integer.parseInt(in.nextLine());
        int number3 = Integer.parseInt(in.nextLine());

        int biggestOfthree= -200;
        if (number1>=biggestOfthree){
            biggestOfthree=number1;}
        if (number2>=biggestOfthree){
            biggestOfthree=number2;
        }

        if (number3>=biggestOfthree){
            biggestOfthree=number3;}
        System.out.println(biggestOfthree);


    }

}
