import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int bigger = Math.max(num1,num2);
        boolean firstNum = (num1>-200&&num1<200);
        boolean secondNum = (num2>-200&&num2<200);
        boolean thirdNum = (num3>-200&&num3<200);
firstNum=true;
secondNum=true;
thirdNum=true;

        if (bigger>num3 && firstNum && secondNum&& thirdNum){
            System.out.println(bigger);
        }

else {
            System.out.println(num3);
        }

    }
}
