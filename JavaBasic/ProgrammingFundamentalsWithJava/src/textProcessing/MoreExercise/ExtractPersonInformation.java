package textProcessing.MoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputLine =Integer.parseInt(in.nextLine());
        String name = "";
        String age = "";
        for (int i = 0; i <inputLine ; i++) {
            String info = in.nextLine();
            name = info.substring(info.indexOf('@')+1,info.indexOf('|'));
            age = info.substring(info.indexOf('#')+1,info.indexOf('*'));
            System.out.printf("%s is %s years old.%n",name,age);
        }

    }
}
