import java.util.Scanner;

public class WordOrNum3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int sum = 0;
        int num = 0;
        String input =" ";
        String wordRes = "";
      Character previous = ' ';
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            input = in.nextLine();
            if(input.matches("[0-9]+") || input.startsWith("-")){
                num = Integer.parseInt(input);
               previous='d';

            }
               else if (input.matches("[a-zA-Z].*")) {
               sb = new StringBuilder(input);
                 wordRes+=  sb.append("-");
                   previous = 'l';
                   sum=0;
            }

          if (previous=='d'){
              sum+=num;
          }
          else {
              sum=num;
          }
            }
        System.out.println(sum);
        System.out.println(wordRes);


        }

    }

