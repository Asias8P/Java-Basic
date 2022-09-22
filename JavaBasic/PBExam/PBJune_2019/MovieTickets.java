package PBJune_2019;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = Integer.parseInt(in.nextLine());
        int a2 = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            char symbol1 = (char) i;
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= n / 2 - 1; k++) {
                  //  for (int l = a1; l <= a2 - 1; l++) {
                      if ((int) symbol1 % 2 != 0  && (j + k + i) % 2 != 0) {
                            System.out.printf("%s-%d%d%d%n", symbol1, j, k, i);

                        }

                    }

                }
            }
        }
    }

