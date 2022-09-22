import java.util.Scanner;

public class OddAndEvenProduct {
    public static void main(String[] args) {


        //You are given n integers
        // (given in a single line, separated by a space).
        //Write a program that checks whether the product
        // of the odd elements is equal to the product of the even elements.
        //Elements are counted from 1 to n,
        // so the first element is odd, the second is even, etc.
       Scanner sc = new Scanner(System.in);
        String numbersAsString = sc.nextLine();

       // String noSpaceStr = "" + numbersAsString;
        String noSpaceStr2 = numbersAsString.replaceAll("\\s", "");

        int productOdd = 1;
        int productEven = 1;

        for (int i = 1; i <= noSpaceStr2.length(); i++) {
            int   digit = Integer.parseInt("" + noSpaceStr2.charAt(i-1));

            if (i % 2 == 0) {
                productEven = productEven * digit;
            } else {
                productOdd = productOdd * digit;
            }

        }
        System.out.println("Even product: " + productEven);
        System.out.println("Odd product: " + productOdd);

        if (productEven == productOdd) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }}
//        Scanner in = new Scanner(System.in);
//
//        String input = in.nextLine();
//       String space = ""+input;
//
//
//        int even = 1;
//        int odd = 1;
//
//       for (int i =1; i<=input.length()-1;i++){
//           int number = Integer.parseInt(""+space.charAt(i-1));
//
//
//          if(i % 2==0){
//                even*=number;
//            }
//            else {
//                odd*=number;
//            }
//
//        }
//     if (even==odd){
//         System.out.println("yes");
//        }
//     else {
//         System.out.println("no");
//     }
//        System.out.println("even product:"+even);
//        System.out.println("odd product:"+odd);
//    }
//}

