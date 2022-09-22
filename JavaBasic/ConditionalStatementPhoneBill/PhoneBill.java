import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int messages = Integer.parseInt(in.nextLine());
        int minutes = Integer.parseInt(in.nextLine());
        int additionalMessages = messages-20;
        double additionalAmountForMessages = additionalMessages*0.06;
        int additionalMinutes = minutes-60;
        double additionalAmountForMinutes = additionalMinutes*0.10;
        double taxMes= additionalAmountForMessages*0.2;
        double taxMin= additionalAmountForMinutes*0.2;
        double taxTotal = taxMes+taxMin;
        double total = additionalAmountForMessages+additionalAmountForMinutes+taxTotal+12;

        if (additionalMessages>0 && additionalMinutes>0){
            System.out.printf("%d additional messages for %.2f levas%n",additionalMessages,additionalAmountForMessages);
            System.out.printf("%d additional minutes for %.2f levas%n",additionalMinutes,additionalAmountForMinutes);
            System.out.printf("%.2f additional taxes%n",taxTotal);
            System.out.printf("%.2f total bill",total);
        }

        else if ((additionalMessages<=0 && additionalMinutes>0)){
            additionalMessages=0;
            additionalAmountForMessages=0;
            taxMes= additionalAmountForMessages*0.2;
            taxTotal = taxMes+taxMin;
            total = additionalAmountForMessages+additionalAmountForMinutes+taxTotal+12;

            System.out.printf("%d additional messages for %.2f levas%n",additionalMessages,additionalAmountForMessages);
            System.out.printf("%d additional minutes for %.2f levas%n",additionalMinutes,additionalAmountForMinutes);
            System.out.printf("%.2f additional taxes%n",taxMin);
            System.out.printf("%.2f total bill",total);

        }

        else if (additionalMessages>0 && additionalMinutes<=0){
            additionalMinutes=0;
            additionalAmountForMinutes =0;
            taxMin= additionalAmountForMinutes*0.2;
            taxTotal = taxMes+taxMin;
            total = additionalAmountForMessages+additionalAmountForMinutes+taxTotal+12;

            System.out.printf("%d additional messages for %.2f levas%n",additionalMessages,additionalAmountForMessages);
            System.out.printf("%d additional minutes for %.2f levas%n",additionalMinutes,additionalAmountForMinutes);
            System.out.printf("%.2f additional taxes%n",taxMes);
            System.out.printf("%.2f total bill",total);}

        else if ((additionalMessages<=0 && additionalMinutes<=0)){
            additionalMessages=0;
            additionalAmountForMessages=0;
            additionalMinutes=0;
            additionalAmountForMinutes =0;
            taxTotal = 0;
            total = additionalAmountForMessages+additionalAmountForMinutes+taxTotal+12;
            System.out.printf("%d additional messages for %.2f levas%n",additionalMessages,additionalAmountForMessages);
            System.out.printf("%d additional minutes for %.2f levas%n",additionalMinutes,additionalAmountForMinutes);
            System.out.printf("%.2f additional taxes%n",taxTotal);
            System.out.printf("%.2f total bill",total);}

        }

    }

