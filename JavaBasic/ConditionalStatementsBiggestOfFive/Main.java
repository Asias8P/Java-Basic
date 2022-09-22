import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        int bigger1 = Math.max(num1,num2);
        int bigger2 = Math.max(num3,num4);

        boolean firstNum = (num1>-200&&num1<200);
        boolean secondNum = (num2>-200&&num2<200);
        boolean thirdNum = (num3>-200&&num3<200);
        boolean forthNum = (num4>-200&&num4<200);
        boolean fifthNum = (num5>-200&&num5<200);
        firstNum=true;
        secondNum=true;
        thirdNum=true;
        forthNum=true;
        fifthNum=true;

        if (bigger1>bigger2 && bigger1>num5 && firstNum && secondNum&& thirdNum && forthNum && fifthNum){
            System.out.println(bigger1);
        }

        else if (bigger2>bigger1 && bigger2>num5 && firstNum && secondNum&& thirdNum && forthNum && fifthNum) {
            System.out.println(bigger2);
        }
 else
            System.out.println(num5);
    }
}
