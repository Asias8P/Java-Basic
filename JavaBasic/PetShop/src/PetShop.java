import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogsFood = Integer.parseInt(input.nextLine());
        int catsFood = Integer.parseInt(input.nextLine());
        double totalFordogs = dogsFood*2.50;
        int totalForCats = catsFood*4;
        double total = totalForCats+totalFordogs;
        System.out.println(total+" lv.");

    }
}
