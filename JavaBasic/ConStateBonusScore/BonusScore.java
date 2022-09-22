import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=  Integer.parseInt(in.nextLine());
        if (num >=1 && num<=3){
            System.out.println(num*10);
        }
        else if(num>=4 && num<=6){
            System.out.println(num*100);
        }
        else if(num>=7 && num<=9){
            System.out.println(num*1000);
        }
        else {
            System.out.println("invalid score");
        }
    }
}
