import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        int numOfprojects = Integer.parseInt(input.nextLine());
        int totalHours = numOfprojects*3;
        System.out.println("The architect "+ name + " will need " + totalHours +" hours to complete " + numOfprojects+" project/s.");

    }
}
