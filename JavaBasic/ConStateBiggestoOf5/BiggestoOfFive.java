import java.util.Scanner;

public class BiggestoOfFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());
        int num4 = Integer.parseInt(in.nextLine());
        int num5 = Integer.parseInt(in.nextLine());
        boolean n1 = num1>=-200 && num1<=200;
        boolean n2 = num2>=-200 && num2<=200;
        boolean n3 = num3>=-200 && num3<=200;
        boolean n4 = num4>=-200 && num4<=200;
        boolean n5 = num5>=-200 && num5<=200;
        int biggest = -200;
        if (num1>biggest && n1 && n2 && n3 && n4 && n5){
            biggest=num1;
        }
        if (num2>biggest && n1 && n2 && n3 && n4 && n5){
            biggest=num2;
        }
        if (num3>biggest && n1 && n2 && n3 && n4 && n5){
            biggest=num3;
        }
        if (num4>biggest && n1 && n2 && n3 && n4 && n5){
            biggest=num4;
        }
        if (num5>biggest && n1 && n2 && n3 && n4 && n5){
            biggest=num5;
        }
        System.out.println(biggest);

//        int bigger12 = Math.max(num1,num2);
//        int bigger34 = Math.max(num3,num4);
//        int bigger = Math.max(bigger12,bigger34);
//        if(bigger>num5){
//            System.out.println(bigger);
//        }
//         else {
//            System.out.println(num5);
//        }
    }
}
