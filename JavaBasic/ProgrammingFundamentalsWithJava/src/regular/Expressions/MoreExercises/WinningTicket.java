package regular.Expressions.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> tickets = Arrays.stream(in.nextLine().split("\\s*,\\s+"))
                .collect(Collectors.toList());

        String ticketPattern = "^[(\\w+\\d+\\D+\\W+)*]{20}$";
        Pattern pattern = Pattern.compile(ticketPattern);

        for (String ticket : tickets) {
            Matcher matcher = pattern.matcher(ticket);
            if (!matcher.find()) {
                System.out.println("invalid ticket");

            } else {
                int counter10 = 0;
                int counter20 = 0;
                int winnerCounter10 = 0;
                int winnerCounter20 = 0;
                boolean isWinning10 = false;
                boolean isWinning20 = false;
                boolean jackpot = false;
                char winningLetter10 =' ';
                char winningLetter20 =' ';
                char jackpotLetter = ' ';
                char letter =' ';
                for (int i = 0; i <= 9; i++) {
                    letter = ticket.charAt(i);
                    if (letter == '#'|| letter == '@' || letter == '$' || letter == '^' && letter == ticket.charAt(i + 1)) {
                        counter10++;
                        if(counter10>=6){
                            winnerCounter10=counter10;
                            isWinning10=true;
                            winningLetter10=letter;
                        }
                    } else{
                        counter10 = 0;
                    }
                }
                for (int j = 19; j >= 10; j--) {
                    letter = ticket.charAt(j);
                    if (letter == '#' || letter == '@' || letter == '$' || letter == '^' && letter == ticket.charAt(j - 1)) {
                        counter20++;
                        if(counter20>=6){
                            isWinning20=true;
                            winningLetter20= letter;
                            winnerCounter20=counter20;
                        }
                    } else {
                        counter20 = 0;}
                }
                if ((isWinning10 && isWinning20) && (winnerCounter10==winnerCounter20) && (winnerCounter10<10) && winningLetter10==winningLetter20) {
                    System.out.printf("ticket \"%s\" - %d%s%n", ticket, winnerCounter10, winningLetter10);
                }
               else if((counter10 < 6) || (winnerCounter20!=winnerCounter10 || winningLetter10!=winningLetter20)){
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
               else if (winnerCounter10 == 10 && winnerCounter20 == 10 && winningLetter10==winningLetter20) {
                    jackpot = true;
                    jackpotLetter = letter;
                    System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, winnerCounter10, winningLetter10);
                }



            }

        }
    }
}

