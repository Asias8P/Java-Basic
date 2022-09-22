package PB_Exam_July_2019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = Integer.parseInt(in.nextLine());
        int width = Integer.parseInt(in.nextLine());
        int percentNotPainted= Integer.parseInt(in.nextLine());
        double area = 4*(height*width);
        double totalAreaForPaint= Math.ceil(area-(area*percentNotPainted/100));
        int sum=0;
        boolean isPainted=false;
        int litresPaint=0;
        String input= in.nextLine();
        while (!input.equals("Tired!")){
            litresPaint=Integer.parseInt(input);
            sum+=litresPaint;
            if(sum>=totalAreaForPaint){
                isPainted=true;
                break;
            }

            input=in.nextLine();
        }

        if(isPainted){
            if(sum>totalAreaForPaint){
                System.out.printf("All walls are painted and you have %.0f l paint left!",sum-totalAreaForPaint);
            }
            else {
                System.out.printf("All walls are painted! Great job, Pesho!%n");
            }

        }
        else {
            System.out.printf("%.0f quadratic m left.",totalAreaForPaint-sum);
        }
    }
}
