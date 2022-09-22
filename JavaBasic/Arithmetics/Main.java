

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);

            int a = Integer.parseInt(num1.nextLine());
            int b = Integer.parseInt(num2.nextLine());

            System.out.println(a+b);

            System.out.println(a-b);

            System.out.println(a*b);

            System.out.println(a%b);

             System.out.printf("%.0f",Math.pow(a,b));
            }
        }

