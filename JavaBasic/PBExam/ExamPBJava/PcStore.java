package ExamPBJava;

import java.util.Scanner;

public class PcStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceProcessor=Double.parseDouble(in.nextLine());
        double priceVideoCard=Double.parseDouble(in.nextLine());
        double priceRam=Double.parseDouble(in.nextLine());
        double numRam=Double.parseDouble(in.nextLine());
        double percentDiscount=Double.parseDouble(in.nextLine());

        double PriceProcessorBGN=priceProcessor*1.57;
        double PriceVideocardBGN=priceVideoCard*1.57;
        double PriceRAMBGN=priceRam*1.57;

        double processPlusVideocarPrice =PriceProcessorBGN+PriceVideocardBGN;
        double processVideocardPlusDiscount= processPlusVideocarPrice-(processPlusVideocarPrice*percentDiscount);

        double total =processVideocardPlusDiscount+numRam*PriceRAMBGN;

        System.out.printf("Money needed - %.2f leva.",total);

    }
}
