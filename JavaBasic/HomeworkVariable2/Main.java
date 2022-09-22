import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     //System.out.print("Company name:");
     String dataCompany= in.nextLine();

     System.out.print("Address:");
     dataCompany=in.nextLine();

         System.out.print("Tel.");
         dataCompany=in.nextLine();

     System.out.print("Fax:");
     dataCompany=in.nextLine();

        System.out.print("Web site:");
        dataCompany=in.nextLine();

        String firstName= in.nextLine();
        String lastName= in.nextLine();
        String age = in.nextLine();
        String tel = in.nextLine();

        System.out.printf("Manager: %s, %s (age:%s,tel.%s:",firstName, lastName,age,tel);



    }
}
