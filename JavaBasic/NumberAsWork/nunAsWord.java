import java.util.Scanner;

public class nunAsWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= Integer.parseInt(in.nextLine());
         int hundreds= (number /100) %10;
        int tens= (number /10) %10;
        int ones= number %10;
            if (number==0)
                System.out.println("zero");
        switch (hundreds){
            case 1:
                System.out.print("one hundred ");
                break;
                case 2:
                System.out.print("two hundred ");
                break;
               case 3:
                   System.out.print("three hundred ");
                break;
            case 4:
                System.out.print("four hundred ");
                break;
            case 5:
                System.out.print("five hundred ");
                break;
            case 6:
                System.out.print("six hundred ");
                break;
            case 7:
                System.out.print("seven hundred ");
                break;
            case 8:
                System.out.print("eight hundred ");
                break;
            case 9:
                System.out.print("nine hundred ");
                break;
}
        if (hundreds>=1 && tens>=1){
            System.out.print("and ");
        }
               switch  (tens){

               case 1:
               if (ones==0){
                   System.out.print("ten ");
                }

               if (ones==1){
                System.out.print("eleven ");
                }

              if (ones==2){
               System.out.print("twelve ");
               }

               if (ones==3){
               System.out.print("thirteen ");
                }

             if (ones==4){
             System.out.print("fourteen ");
             }

            if (ones==5){
            System.out.print("fifteen ");
           }

            if (ones==6){
            System.out.print("sixteen ");
            }

           if (ones==7){
            System.out.print("seventeen ");
            }

            if (ones==8){
            System.out.print("eighteen ");
           }

           if (ones==9){
            System.out.print("nineteen ");
        }
       break;

    case 2:
        System.out.print("twenty ");
        break;
    case 3:
        System.out.print("thirty ");
        break;
    case 4:
        System.out.print("forty ");
        break;
    case 5:
        System.out.print("fifty ");
        break;
    case 6:
        System.out.print("sixty ");
        break;
    case 7:
        System.out.print("seventy ");
        break;
    case 8:
        System.out.print("eighty ");
        break;
    case 9:
        System.out.print("ninety ");
        break;

}
        if (hundreds>=1 && tens== 0 && ones>0){
            System.out.print("and ");
        }

        switch (ones){

            case 1:
          if(tens!=1){
                System.out.println("one");
                break;}
            case 2:
                if(tens!=1){
                System.out.println("two");
                break;}
            case 3:
                if(tens!=1){
                System.out.println("three");
                break;}
            case 4:
                if(tens!=1){
                System.out.println("four");
                break;}
            case 5:
                if(tens!=1){
                System.out.println("five");
                break;}
            case 6:
                if(tens!=1){
                System.out.println("six");
                break;}
            case 7:
                if(tens!=1){
                System.out.println("seven");
                break;}
            case 8:
                if(tens!=1){
                System.out.println("eight");
                break;}
            case 9:
                if(tens!=1){
                System.out.println("nine");
                break;}

        }
    }}

