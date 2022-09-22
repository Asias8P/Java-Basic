import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int modDev = year % 12;


//        Year	Animal		Year	Animal
//        2000	Dragon		2006	Dog
//        2001	Snake		2007	Pig
//        2002	Horse		2008	Rat
//        2003	Sheep		2009	Ox
//        2004	Monkey		2010	Tiger
//        2005	Rooster		2011	Hare

        switch (modDev){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                if (modDev==4)
                    System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Hare");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }

//
//        if (modDev==1){
//            System.out.println("Rooster");
//        }
//        else if (modDev==2){
//            System.out.println("Dog");
//        }
//        else if (modDev==3){
//            System.out.println("Pig");
//        }
//       else if (modDev==4){
//            System.out.println("Rat");
//        }
//       else if (modDev==5){
//            System.out.println("Ox");
//        }
//        else if (modDev==6){
//            System.out.println("Tiger");
//        }
//       else if (modDev==7){
//            System.out.println("Hare");
//        }
//       else if (modDev==8){
//            System.out.println("Dragon");
//        }
//       else if (modDev==9){
//            System.out.println("Snake");
//        }
//       else if (modDev==10){
//            System.out.println("Horse");
//        }
//       else if (modDev==11){
//            System.out.println("Sheep");
//        }
//        else if (modDev==0){
//            System.out.println("Monkey");
//        }


    }
}
