import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
         int previoursnumber=0;
         int nextnumber =Integer.MAX_VALUE;
        for (int i =1; i<=N;i++){
           previoursnumber = Integer.parseInt(in.nextLine());
       //   System.out.print(previoursnumber);
           if (nextnumber==Integer.MAX_VALUE){
               System.out.print("");
           }

          else   if(nextnumber>previoursnumber){
                System.out.println(nextnumber+">"+previoursnumber);
               System.out.println();
            }
            else if (nextnumber<previoursnumber){
                System.out.println(nextnumber+"<"+previoursnumber);
               System.out.println();}

            else {
                System.out.println(nextnumber+"="+previoursnumber);
            }

            nextnumber=previoursnumber;


        }

            }}




